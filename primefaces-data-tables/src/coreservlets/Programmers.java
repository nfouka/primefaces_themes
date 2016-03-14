package coreservlets;

public class Programmers {
  private static String[] levels =
    { "Beginner", "Junior", "Intermediate", "Senior", "Super Hacker" };
  
  public static Programmer makeProgrammer(int i) {
    String firstName = "Firstname" + i;
    String lastName = "Lastname" + i;
    String level = RandomUtils.randomElement(levels);
    double salary = Math.random() * 1_000_000;
    String[] languages = 
      { "LanguageA" + i, "LanguageB" + i, "LanguageC" + i };
    return(new Programmer(firstName, lastName, level, salary, languages));
  }
  
  public static Programmer[] makeProgrammers(int count) {
    Programmer[] programmers = new Programmer[count];
    for(int i=0; i<programmers.length; i++) {
      programmers[i] = makeProgrammer(i);
    }
    return(programmers);
  }
  
  private Programmers() {} // Uninstantiatable class: static methods only
}
