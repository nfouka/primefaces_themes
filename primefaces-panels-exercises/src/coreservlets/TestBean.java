package coreservlets;

import java.util.Date;
import javax.faces.bean.*;

@ApplicationScoped
@ManagedBean
public class TestBean {
  public Date getDate() {
    return(new Date());
  }
}