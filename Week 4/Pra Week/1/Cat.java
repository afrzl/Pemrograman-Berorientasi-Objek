/**
 * Cat
 */
public class Cat extends Animal {

  Cat(String name) {
    super(name);
  }

  @Override
  public void greets() {
    System.out.println("Meow");
  }
}
