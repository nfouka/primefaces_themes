package coreservlets;

import javax.faces.bean.*;

import org.primefaces.model.chart.*;

@ManagedBean
@ApplicationScoped
public class LineChart {
  private LineChartModel yearModel;
  
  public LineChart() {
    yearModel = new LineChartModel();
    setAxisInfo();
    ChartData sampleData = new ChartData();
    LineChartSeries primeFacesSeries = sampleData.primeFacesSeries();
    yearModel.addSeries(primeFacesSeries);
    LineChartSeries richFacesSeries = sampleData.richFacesSeries();
    yearModel.addSeries(richFacesSeries);
    LineChartSeries iceFacesSeries = sampleData.iceFacesSeries();
    yearModel.addSeries(iceFacesSeries);
  }

  public LineChartModel getYearModel() {
    return(yearModel);
  }
  
  private void setAxisInfo() {
    yearModel.setTitle("Search Volume By Year");
    yearModel.setLegendPosition("e");
    yearModel.setShowPointLabels(true);
    yearModel.getAxes().put(AxisType.X, new CategoryAxis("Year"));
    Axis yAxis = yearModel.getAxis(AxisType.Y);
    yAxis.setMin(0);
    yAxis.setMax(100);
    yAxis.setLabel("Search Volume");
  }
}
