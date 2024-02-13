import java.time.LocalDate;

/**
 * MainTest
 */
public class MainTest {

  public static void main(String[] args) {
    Employee aku = new Dean(123, "Aku", "aku@gmail.com");
    Institute informatika = new Institute("Informatika", "Jalan-jalan");
    Institute sainsData = new Institute("Sains Data", "Jalan sebelah");

    Faculty fmipa = new Faculty(
      "FATISDA",
      new Institute[] { informatika, sainsData },
      aku
    );

    AdministrativeEmployee dia = new AdministrativeEmployee(
      111,
      "dia",
      "dia@gmail.com"
    );

    ResearchAssociate kamu = new ResearchAssociate(
      122,
      "kamu",
      "kamu@gmail.com",
      "OOP"
    );
    kamu.setInstitutes(new Institute[] { informatika });

    ResearchAssociate kamu2 = new ResearchAssociate(
      122,
      "kamu2",
      "kamu2@gmail.com",
      "OOP, English, Pemweb"
    );
    kamu2.setInstitutes(new Institute[] { informatika, sainsData });

    Course oop = new Course(1, "OOP", 2, kamu);
    Course pemweb = new Course(2, "Pemrograman Web", 3, kamu2);

    Project project = new Project(
      "Project 1",
      5,
      LocalDate.of(2024, 2, 12),
      LocalDate.of(2024, 2, 15),
      kamu
    );

    System.out.println(dia + "\n");
    dia.attendant();
    dia.attendant();
    System.out.println(dia + "\n");
    System.out.println(fmipa + "\n");
    System.out.println(oop + "\n");
    System.out.println(pemweb + "\n");
    System.out.println(project + "\n");
  }
}
