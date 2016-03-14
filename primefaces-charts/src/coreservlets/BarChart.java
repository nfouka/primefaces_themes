package coreservlets;

import javax.faces.bean.*;

import org.primefaces.model.chart.*;

@ManagedBean
@ApplicationScoped
public class BarChart {
  private BarChartModel yearModel;
  
  public BarChart() {
    yearModel = new BarChartModel();
    setAxisInfo();
    ChartData sampleData = new ChartData();
    BarChartSeries primeFacesSeries = sampleData.primeFacesSeries2();
    yearModel.addSeries(primeFacesSeries);
    BarChartSeries richFacesSeries = sampleData.richFacesSeries2();
    yearModel.addSeries(richFacesSeries);
    BarChartSeries iceFacesSeries = sampleData.iceFacesSeries2();
    yearModel.addSeries(iceFacesSeries);
  }

  public BarChartModel getYearModel() {
    return(yearModel);
  }
  
  private void setAxisInfo() {
    yearModel.setTitle("Search Volume By Year");
    yearModel.setLegendPosition("e");
    Axis xAxis = yearModel.getAxis(AxisType.X);
    xAxis.setLabel("Year");
    Axis yAxis = yearModel.getAxis(AxisType.Y);
    yAxis.setMin(0);
    yAxis.setMax(100);
    yAxis.setLabel("Search Volume"); 
  }
}
