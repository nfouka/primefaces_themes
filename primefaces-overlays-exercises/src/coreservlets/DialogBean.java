package coreservlets;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class DialogBean {
  public double getRandomNum() {
    return(Math.random());
  }
}
