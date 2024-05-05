/**
 * Nomor11
 */
class MyClass {
  private static int counter = 0;
  private int id;

  MyClass() {
    id = counter++;
  }

  public int getId() {
    return id;
  }

  public static int getCounter() {
    return counter;
  }
}

public class Nomor11 {

  public static void main(String[] args) {
    MyClass obj1 = new MyClass();
    MyClass obj2 = new MyClass();
    System.out.println(MyClass.getCounter());
    System.out.println(obj1.getId());
    System.out.println(obj2.getId());
  }
}
