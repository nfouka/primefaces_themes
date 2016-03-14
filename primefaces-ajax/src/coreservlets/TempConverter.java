package coreservlets;

import javax.faces.bean.ManagedBean;

@ManagedBean 
public class TempConverter  {
  private String celsius, kelvin;
  
  public String getCelsius() {
    return(celsius);
  }

  public String getKelvin() {
    return(kelvin);
  }

  public String getFahrenheit() {
    return("");
  }

  public void setFahrenheit(String fTemp) {
    double f = 0;
    try {
      f = Double.parseDouble(fTemp);
      f = Math.max(f, -459.4); // Absolute zero
      double c = (f - 32)*(5.0/9.0);
      double k = c + 273;
      celsius = String.format("%.2f", c);
      kelvin = String.format("%.2f", k);
    } catch(NumberFormatException nfe) {
      celsius = "Invalid";
      kelvin = "Invalid";
    }
  }
}
