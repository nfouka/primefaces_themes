package coreservlets;

import javax.faces.bean.*;

@ManagedBean
public class IntroBean {
  private int num;
  
  public int getNum() {
    return(num);
  }

  public void setNum(int num) {
    this.num = num;
  }

  public String doSend() {
    return("send-page");
  }
  
  public String doCancel() {
    return("cancel-page");
  }
}
