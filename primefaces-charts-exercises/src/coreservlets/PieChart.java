package coreservlets;

import javax.faces.bean.*;

import org.primefaces.model.chart.PieChartModel;

@ManagedBean
@ApplicationScoped // Data does not change
public class PieChart {
  private PieChartModel model;
  
  public PieChart() {
    model = new PieChartModel();
    model.set("Apple", 45);
    model.set("Cherry", 30);
    model.set("Pecan", 20);
    model.set("Shoofly", 5);
    model.setTitle("Grand Traverse Pie Company<br/>Sales Percent by Pie Type");
    model.setLegendPosition("e");
  }

  public PieChartModel getModel() {
    return(model);
  }
}
