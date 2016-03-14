package coreservlets;

import javax.faces.application.FacesMessage;
import javax.faces.bean.*;
import javax.faces.context.FacesContext;

@ManagedBean
public class BidBean {
  private String itemId;
  private Double bidAmount;
  
  public String getItemId() {
    return(itemId);
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public Double getBidAmount() {
    return(bidAmount);
  }

  public void setBidAmount(Double bidAmount) {
    this.bidAmount = bidAmount;
  }

  public String confirmBid() {
    return("show-bid-data");
  }
  
  public String confirmBid2() {
    String messageTemplate = "You bid %.2f for item %s";
    String messageText = String.format(messageTemplate, bidAmount, itemId);
    FacesMessage message = new FacesMessage(messageText);
    message.setSeverity(FacesMessage.SEVERITY_INFO);
    FacesContext.getCurrentInstance().addMessage(null, message);
    return(null);
  }
}
