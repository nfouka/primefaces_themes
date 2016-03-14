package coreservlets;

import java.util.*;

public class Company {
  private String companyName;
  private List<Programmer> programmers;
  
  public Company(String companyName,
                 Programmer... programmers) {
    this.companyName = companyName;
    this.programmers = Arrays.asList(programmers);
  }
  
  public String getCompanyName() {
    return(companyName);
  }

  public List<Programmer> getProgrammers() {
    return(programmers);
  }
}
