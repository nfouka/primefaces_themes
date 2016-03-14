package coreservlets;

import java.util.*;

import javax.faces.application.FacesMessage;
import javax.faces.bean.*;
import javax.faces.context.FacesContext;

import org.primefaces.event.ItemSelectEvent;
import org.primefaces.model.chart.*;

@ManagedBean
@ApplicationScoped
public class AjaxBarChart extends BarChart {
  public void handleItemSelect(ItemSelectEvent event) {
    BarChartModel model = getYearModel(); // From parent class BarChart
    int seriesIndex = event.getSeriesIndex();
    int itemIndex = event.getItemIndex();
    List<ChartSeries> allSeries = model.getSeries();
    ChartSeries selectedSeries = allSeries.get(seriesIndex);
    Map<Object,Number> seriesMap = selectedSeries.getData();
    String componentLibraryName = selectedSeries.getLabel();
    String mapKey = String.valueOf(ChartData.START_YEAR + itemIndex);
    Number mapValue = seriesMap.get(mapKey);
    String messageText = 
      String.format("Relative search volume for %s in %s was %s.", 
                    componentLibraryName, mapKey, mapValue);
    FacesMessage message = new FacesMessage(messageText);
    message.setSeverity(FacesMessage.SEVERITY_INFO);
    FacesContext.getCurrentInstance().addMessage(null, message);
  }
}
