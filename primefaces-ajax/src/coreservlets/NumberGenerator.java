package coreservlets;

import javax.faces.bean.*;

@ManagedBean
public class NumberGenerator  {
  private double number = Math.random();
  private double range = 1.0;
  
  public double getRange() {
    return(range);
  }

  public void setRange(double range) {
    this.range = range;
  }

  public double getNumber() {
    return(range * number);
  }
  
  public double getNumberSlow() {
    try {
      Thread.sleep(2500);
    } catch(InterruptedException ie) {
    }
    return(range * number);
  }
  
  public String randomize() {
    number = Math.random();
    return(null);
  }
}
