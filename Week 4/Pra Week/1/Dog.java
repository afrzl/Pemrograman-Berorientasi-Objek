/**
 * Dog
 */
public class Dog extends Animal {

  Dog(String name) {
    super(name);
  }

  @Override
  public void greets() {
    System.out.println("Woof");
  }

  public void greets(Dog another) {
    System.out.println("Woooof");
  }
}
