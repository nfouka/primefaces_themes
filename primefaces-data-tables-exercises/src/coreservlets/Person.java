package coreservlets;

public class Person {
  private String firstName, lastName, emailAddress;
  private int age;
  
  public Person(String firstName, String lastName, String emailAddress, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.emailAddress = emailAddress;
    this.age = age;
  }

  public String getFirstName() {
    return(firstName);
  }
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  public String getLastName() {
    return(lastName);
  }
  
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  public String getEmailAddress() {
    return(emailAddress);
  }
  
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }
  
  public int getAge() {
    return(age);
  }
  
  public void setAge(int age) {
    this.age = age;
  }
}
