package coreservlets;

import javax.faces.bean.*;

import org.primefaces.model.chart.*;

@ManagedBean
@ApplicationScoped
public class BarChart {
  private BarChartModel model;
  
  public BarChart() {
    model = new BarChartModel();
    setAxisInfo();
    BarChartSeries upTrend = new BarChartSeries();
    upTrend.setLabel("Unhealthy Foods That Taste Good");
    upTrend.set("Day 1", 0);
    upTrend.set("Day 2", 5);
    upTrend.set("Day 3", 10);
    upTrend.set("Day 4", 15);
    upTrend.set("Day 5", 20);
    model.addSeries(upTrend);
    BarChartSeries downTrend = new BarChartSeries();
    downTrend.setLabel("Healthy Foods That Taste Bad");
    downTrend.set("Day 1", 20);
    downTrend.set("Day 2", 15);
    downTrend.set("Day 3", 10);
    downTrend.set("Day 4", 5);
    downTrend.set("Day 5", 0);
    model.addSeries(downTrend);
    BarChartSeries flatTrend = new BarChartSeries();
    flatTrend.setLabel("Medium-Healthy Foods That Taste OK");
    flatTrend.set("Day 1", 10);
    flatTrend.set("Day 2", 10);
    flatTrend.set("Day 3", 10);
    flatTrend.set("Day 4", 10);
    flatTrend.set("Day 5", 10);
    model.addSeries(flatTrend);
  }

  public BarChartModel getModel() {
    return(model);
  }
  
  private void setAxisInfo() {
    model.setTitle("Sales Trends");
    model.setLegendPosition("e");
    model.setShowPointLabels(true);
    model.getAxes().put(AxisType.X, new CategoryAxis("Day"));
    Axis yAxis = model.getAxis(AxisType.Y);
    yAxis.setMin(0);
    yAxis.setMax(20);
    yAxis.setLabel("Sales Volume");
  }
}
