/**
 * AllTest
 */
import java.time.LocalDate;

public class AllTest {

  public static void main(String[] args) {
    Customer aku = new Customer("aku");
    Customer kamu = new Customer("kamu");
    Customer dia = new Customer("dia");
    aku.setMember(true);
    aku.setMemberType("Premium");
    dia.setMember(true);
    dia.setMemberType("Silver");

    Visit aku1 = new Visit(aku, LocalDate.of(2024, 1, 25));
    aku1.setServiceExpense(5.75);
    aku1.setProductExpense(4.5);
    System.out.println(aku1);

    Visit aku2 = new Visit(aku, LocalDate.now());
    aku2.setServiceExpense(10);
    aku2.setProductExpense(20);
    System.out.println(aku2);

    Visit kamu1 = new Visit(kamu, LocalDate.now());
    kamu1.setServiceExpense(100);
    kamu1.setProductExpense(50);
    System.out.println(kamu1);

    Visit dia1 = new Visit(dia, LocalDate.now());
    dia1.setServiceExpense(7.5);
    dia1.setProductExpense(8);
    System.out.println(dia1);
  }
}
