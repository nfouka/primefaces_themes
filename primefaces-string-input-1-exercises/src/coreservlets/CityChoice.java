package coreservlets;

import java.util.*;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class CityChoice {
  // City names from
  // http://www.usatoday.com/weather/resources/climate/wusaclim.htm
  private static final String cityString =
    "Aberdeen,Abilene,Adak,Akron,Alamogordo,Alamosa,Albany,Albuquerque,Alexandria,Allentown," +
    "Bakersfield,Baltimore,Banner Elk,Barbers Point,Bar Harbor,Barre,Barrow,Baton Rouge";
  private static final String[] cityArray = cityString.split(",");
  private String city, seatNum;
  private List<String> cities;
  
  public String getCity() {
    return (city);
  }
  
  public void setCity(String city) {
    this.city = city;
  }
  
  public List<String> getCities() {
    return(cities);
  }
  
  public void setCities(List<String> cities) {
    this.cities = cities;
  }
  
  public String getSeatNum() {
    return(seatNum);
  }
  
  public void setSeatNum(String seatNum) {
    this.seatNum = seatNum;
  }
  
  public List<String> completeCity(String cityPrefix) {
    List<String> matches = new ArrayList<>();
    for(String possibleCity: cityArray) {
      if(possibleCity.toUpperCase().startsWith(cityPrefix.toUpperCase())) {
        matches.add(possibleCity);
      }
    }
    return(matches);
  }
  
  public String showCity() {
    return("show-city");
  }
  
  public String showCities() {
    return("show-cities");
  }
  
  public String showCityAndSeat() {
    return("show-city-and-seat");
  }
}
