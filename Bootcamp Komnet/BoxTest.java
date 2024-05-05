/**
 * BoxTest
 */

class Box<T> {
  private T t;

  public void setT(T t) {
    this.t = t;
  }

  public T getT() {
    return t;
  }
}

public class BoxTest {

  public static void main(String[] args) {
    Box<String> stringBox = new Box<>();
  }
}
