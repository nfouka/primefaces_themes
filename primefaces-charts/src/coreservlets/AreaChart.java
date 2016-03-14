package coreservlets;

import java.util.List;

import javax.faces.bean.*;

import org.primefaces.model.chart.*;

@ManagedBean
@ApplicationScoped
public class AreaChart extends LineChart {
  public AreaChart() {
    LineChartModel yearModel = getYearModel();
    List<ChartSeries> seriesList = yearModel.getSeries();
    for(ChartSeries series: seriesList) {
      LineChartSeries lcSeries = (LineChartSeries)series;
      lcSeries.setFill(true);
    }
    yearModel.getAxis(AxisType.Y).setMax(140);
    yearModel.setStacked(true);
  }
}
