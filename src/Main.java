import model.Student;
import model.VoirmeStudent;
import util.QueryList;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    int studentCount = 10;
    List<Student> studentList = new ArrayList<>();

    for (int i = 0; i < studentCount; i++) {
      studentList.add(new Student());
    }
    printList(studentList);

    List<VoirmeStudent> voirmeStudentList = new ArrayList<>();

    for (int i = 0; i < studentCount; i++) {
      voirmeStudentList.add(new VoirmeStudent());
    }
    printList(voirmeStudentList);

    var queryList = new QueryList<>(voirmeStudentList);
    var matches = queryList.getMatches("Course", "Python");
    printList(matches);
  }

  public static void printList(List<? extends Student> students) {
    for (var student : students) {
      System.out.println(student);
    }
    System.out.println();
  }
}
