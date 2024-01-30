/**
 * CustomerTest
 */
public class CustomerTest {

  public static void main(String[] args) {
    Customer customer1 = new Customer("aku");
    customer1.setMember(true);
    customer1.setMemberType("Gold");

    System.out.println(customer1);
  }
}
