package model;

public class VoirmeStudent extends Student{
  private double percentComplete;

  public VoirmeStudent() {
    percentComplete = random.nextDouble(0, 100.001);
  }

  @Override
  public String toString() {
    return "%s %8.1f%%".formatted(super.toString(), percentComplete);
  }

  @Override
  public boolean matchFieldValues(String filedName, String value) {
    if (filedName.equalsIgnoreCase("percentComplete")) {
      return percentComplete <= Integer.parseInt(value);
    }
    return super.matchFieldValues(filedName, value);
  }

  public double getPercentComplete() {
    return percentComplete;
  }
}
