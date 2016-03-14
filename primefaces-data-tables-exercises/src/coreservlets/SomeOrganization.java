package coreservlets;

import java.util.*;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class SomeOrganization {
  private List<Person> members = Arrays.asList(
    new Person("Alice", "Architect", "alice@gmail.com", 35),
    new Person("Adam", "Architect", "adam@gmail.com", 37),
    new Person("Claudine", "Coder", "claudine@example.com", 42),
    new Person("Cody", "Coder", "cody@example.com", 40),
    new Person("Desiree", "Designer", "des123@web-design.org", 38),
    new Person("Dustin", "Designer", "dusty@web-design.org", 39),
    new Person("Devon", "Developer", "devon@google.com", 22),
    new Person("Harry", "Hacker", "harry@whitehat.com", 24),
    new Person("Polly", "Programmer", "polly@twitter.com", 25),
    new Person("Terrence", "Tester", "terry@hotmail.com", 25) );

  public List<Person> getMembers() {
    return(members);
  }
  
  
}
