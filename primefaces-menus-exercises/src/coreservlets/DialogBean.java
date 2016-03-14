package coreservlets;

import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class DialogBean {
  private Date time = new Date();

  public Date getTime() {
    return(time);
  }
  
  public String updateTime() {
    time = new Date();
    return(null);
  }
}
