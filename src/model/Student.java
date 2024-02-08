package model;

import util.QueryItem;

import java.util.Random;

public class Student implements QueryItem {
  private String name;
  private String course;
  private int yearStarted;

  protected static Random random = new Random();

  private static String[] firstNames = {"Anne", "Bill", "Cathy", "John", "Tim"};
  private static String[] courses = {"C++", "Java", "Python"};

  public Student() {
    int lastNameIndex = random.nextInt(65, 91);
    name = firstNames[random.nextInt(5)] + " " + (char) lastNameIndex;
    course = courses[random.nextInt(3)];
    yearStarted = random.nextInt(2018, 2024);
  }

  @Override
  public String toString() {
    return "%-15s %-15s %d".formatted(name, course, yearStarted);
  }

  @Override
  public boolean matchFieldValues(String filedName, String value) {
    String fName = filedName.toUpperCase();
    return switch (fName) {
      case "NAME" -> name.equalsIgnoreCase(value);
      case "COURSE" -> course.equalsIgnoreCase(value);
      case "YEARSTARTED" -> yearStarted == (Integer.parseInt(value));
      default -> false;
    };
  }

  public int getYearStarted() {
    return yearStarted;
  }
}
