package coreservlets;

import javax.faces.bean.*;

import org.primefaces.model.chart.PieChartModel;

// All data from Google Trends for January of that year

@ManagedBean
@ApplicationScoped // Data does not change
public class PieChart {
  private PieChartModel model2011, model2013, model2015;
  
  public PieChart() {
    initialize2011();
    initialize2013();
    initialize2015();
  }
  
  private void initialize2011() {
    model2011 = new PieChartModel();
    model2011.set("PrimeFaces", 26);
    model2011.set("RichFaces", 48);
    model2011.set("IceFaces", 27);
    model2011.setTitle("2011 Search Volume");
    model2011.setLegendPosition("e");
  }

  public PieChartModel getModel2011() {
    return(model2011);
  }
  
  private void initialize2013() {
    model2013 = new PieChartModel();
    model2013.set("PrimeFaces", 65);
    model2013.set("RichFaces", 22);
    model2013.set("IceFaces", 11);
    model2013.setTitle("2013 Search Volume");
    model2013.setLegendPosition("e");
  }

  public PieChartModel getModel2013() {
    return(model2013);
  }
  
  private void initialize2015() {
    model2015 = new PieChartModel();
    model2015.set("PrimeFaces", 68);
    model2015.set("RichFaces", 10);
    model2015.set("IceFaces", 4);
    model2015.setTitle("2015 Search Volume");
    model2015.setLegendPosition("e");
  }

  public PieChartModel getModel2015() {
    return(model2015);
  }
}
