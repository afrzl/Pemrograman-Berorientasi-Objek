/**
 * StudentStaff
 */
public class StudentStaff {

  public static void main(String[] args) {
    Student student1 = new Student("aku", "jalan", "Komputasi", 2022, 10000000);
    Student student2 = new Student(
      "kamu",
      "jalan2",
      "Statistika",
      2021,
      5000000
    );

    System.out.println(student1);
    System.out.println(student2);

    Staff staff1 = new Staff("dia", "jalan3", "Polstat", 5000000);
    Staff staff2 = new Staff("beliau", "jalan4", "STIS", 6000000);

    System.out.println(staff1);
    System.out.println(staff2);
  }
}
