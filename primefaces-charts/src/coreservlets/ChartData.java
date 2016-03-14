package coreservlets;

import org.primefaces.model.chart.*;

// Data from Google Trends for May of that year

public class ChartData {
  public static final int START_YEAR = 2007;
  private static final int[] primeFacesNumbers =
    { 0, 0, 1, 12, 34, 66, 82, 88, 80 };
  private static final int[] richFacesNumbers =
    { 22, 62, 74, 57, 45, 31, 23, 14, 9 };
  private static final int[] iceFacesNumbers =
    { 28, 34,  48, 34, 25, 14, 9, 6, 4 };
  
  private LineChartSeries primeFacesSeries;
  private LineChartSeries richFacesSeries;
  private LineChartSeries iceFacesSeries;
  
  private BarChartSeries primeFacesSeries2;
  private BarChartSeries richFacesSeries2;
  private BarChartSeries iceFacesSeries2;
  
  public ChartData() {
    buildLineChartSeries();
    buildBarChartSeriesFromLineChartSeries();
  }
  
  private void buildLineChartSeries() {
    primeFacesSeries = new LineChartSeries();
    primeFacesSeries.setLabel("PrimeFaces");
    richFacesSeries = new LineChartSeries();
    richFacesSeries.setLabel("RichFaces");
    iceFacesSeries = new LineChartSeries();
    iceFacesSeries.setLabel("IceFaces");
    int numYears = primeFacesNumbers.length;
    for(int i=0; i<numYears; i++) {
      String xValue = String.valueOf(i + START_YEAR);
      int yValue = primeFacesNumbers[i];
      primeFacesSeries.set(xValue, yValue);
      yValue = richFacesNumbers[i];
      richFacesSeries.set(xValue, yValue);
      yValue = iceFacesNumbers[i];
      iceFacesSeries.set(xValue, yValue);
    }
  }
  
  private void buildBarChartSeriesFromLineChartSeries() {
    primeFacesSeries2 = new BarChartSeries();
    primeFacesSeries2.setData(primeFacesSeries.getData());
    primeFacesSeries2.setLabel(primeFacesSeries.getLabel());
    richFacesSeries2 = new BarChartSeries();
    richFacesSeries2.setData(richFacesSeries.getData());
    richFacesSeries2.setLabel(richFacesSeries.getLabel());
    iceFacesSeries2 = new BarChartSeries();
    iceFacesSeries2.setData(iceFacesSeries.getData());
    iceFacesSeries2.setLabel(iceFacesSeries.getLabel());
  }
  
  public LineChartSeries primeFacesSeries() {
    return(primeFacesSeries);
  }
  
  public LineChartSeries richFacesSeries() {
    return(richFacesSeries);
  }
  
  public LineChartSeries iceFacesSeries() {
    return(iceFacesSeries);
  }
  
  public BarChartSeries primeFacesSeries2() {
    return(primeFacesSeries2);
  }
  
  public BarChartSeries richFacesSeries2() {
    return(richFacesSeries2);
  }
  
  public BarChartSeries iceFacesSeries2() {
    return(iceFacesSeries2);
  }
}
