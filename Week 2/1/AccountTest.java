/**
 * AccountTest
 */
public class AccountTest {

  public static void main(String[] args) {
    Account aku = new Account("1", "aku", 10000);
    Account kamu = new Account("2", "kamu", 5000);

    System.out.println(aku.toString());
    System.out.println(kamu.toString());

    aku.transferTo(kamu, 50000);
    aku.transferTo(kamu, 1000);

    System.out.println(aku.toString());
    System.out.println(kamu.toString());
  }
}
