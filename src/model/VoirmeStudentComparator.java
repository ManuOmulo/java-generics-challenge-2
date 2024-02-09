package model;

import java.util.Comparator;

public class VoirmeStudentComparator implements Comparator<VoirmeStudent> {
  @Override
  public int compare(VoirmeStudent s1, VoirmeStudent s2) {
    return (int) (s1.getPercentComplete() - s2.getPercentComplete());
  }
}
