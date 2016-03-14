package coreservlets;

import javax.faces.bean.*;

@ManagedBean
@ApplicationScoped
public class Sorter {
  public int compareLength(String s1, String s2) {;
    return(s2.length() - s1.length());
  }
}
