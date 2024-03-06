/**
 * ObserverPatternMain
 */
public class ObserverPatternMain {

  public static void main(String[] args) {
    PinkBook pinkbook = new PinkBook(true);

    Customer customer1 = new Customer(pinkbook, "Lutfi");
    pinkbook.addObserver(customer1);

    Customer customer2 = new Customer(pinkbook, "Tuti");
    pinkbook.addObserver(customer2);
    // pinkbook.setInStock(true);
  }
}
