package coreservlets;

import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TimeBean {
  private Date time = new Date();

  public Date getTime() {
    return(time);
  }
  
  public String updateTime() {
    time = new Date();
    return(null);
  }
  
  public String updateTimeSlow() {
    try {
      Thread.sleep(2000);
    } catch (InterruptedException ie) {
    }
    return(updateTime());
  }
}
