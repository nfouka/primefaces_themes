package coreservlets;

import java.io.Serializable;
import javax.faces.bean.*;

@ManagedBean
@SessionScoped
public class Company2 extends Company implements Serializable {
  public Company2() {
    super("Some Random Company", 
          Programmers.makeProgrammers(50));
  }
}
