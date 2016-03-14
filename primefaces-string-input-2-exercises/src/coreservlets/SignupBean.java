package coreservlets;

import javax.faces.bean.*;

@ManagedBean
@SessionScoped
public class SignupBean {
  private String username, password, usernameColor="0000ff", passwordColor="ff0000";

  public String getUsername() {
    return(username);
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return(password);
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getUsernameColor() {
    return(usernameColor);
  }

  public void setUsernameColor(String usernameColor) {
    this.usernameColor = usernameColor;
  }

  public String getPasswordColor() {
    return(passwordColor);
  }

  public void setPasswordColor(String passwordColor) {
    this.passwordColor = passwordColor;
  }
  
  public String register() {
    return("confirm-registration");
  }
  
}
