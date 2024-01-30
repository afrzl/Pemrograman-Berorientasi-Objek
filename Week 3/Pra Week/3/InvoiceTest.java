/**
 * InvoiceTest
 */
public class InvoiceTest {

  public static void main(String[] args) {
    Customer3 customer1 = new Customer3(1, "aku", 10);
    Customer3 customer2 = new Customer3(2, "kamu", 5);
    Customer3 customer3 = new Customer3(3, "dia", 0);

    Invoice invoice1 = new Invoice(1, customer1, 100000);
    Invoice invoice2 = new Invoice(2, customer1, 75000);
    Invoice invoice3 = new Invoice(3, customer3, 200000);

    System.out.println(invoice1);
    System.out.println(invoice2);
    System.out.println(invoice3);
  }
}
