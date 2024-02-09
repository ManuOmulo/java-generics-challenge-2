import model.VoirmeStudent;
import model.VoirmeStudentComparator;
import util.QueryList;

import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    QueryList<VoirmeStudent> voirmeList = new QueryList<>();

    for (int i = 0; i < 25; i++) {
      voirmeList.add(new VoirmeStudent());
    }

    System.out.println("Ordered:");
    voirmeList.sort(Comparator.naturalOrder());
    printList(voirmeList);

    System.out.println("Matches");
    var matches = voirmeList.getMatches("percentComplete", "50").getMatches("course", "python");
    matches.sort(new VoirmeStudentComparator());
    printList(matches);

  }

  public static void printList(List<?> students) {
    for (var student : students) {
      System.out.println(student);
    }
    System.out.println();
  }
}
