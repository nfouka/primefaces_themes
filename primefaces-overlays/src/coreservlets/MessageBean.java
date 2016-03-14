package coreservlets;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class MessageBean {
  private String message="", emailAddress="";
  
  public String getMessage() {
    return(message);
  }

  public void setMessage(String message) {
    this.message = message;
  }
  
  public String getEmailAddress() {
    return(emailAddress);
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }
  
  public String showDialogMessage() {
    String messageTemplate =
      "<p>Message that was sent to customer support:</p>\n" +
      "<hr/>\n" +
      "<div style='font-size: 120%%'>\n" +
      "%s\n" +
      "</div>\n" +
      "<hr/>\n" +
      "<p>Replies will be sent to %s.</p>";
    String messageText = 
      String.format(messageTemplate, message, emailAddress);
    sendMessageToCustomerSupport();
    FacesMessage message = new FacesMessage(messageText);
    message.setSeverity(FacesMessage.SEVERITY_INFO);
    FacesContext.getCurrentInstance().addMessage(null, message);
    return(null);
  }

  public String showMessage() {
    sendMessageToCustomerSupport();
    return("show-message");
  }
  
  private void sendMessageToCustomerSupport() {
    // Ignore message and tell customer 
    // it has been filed for consideration :-)
  }
}
