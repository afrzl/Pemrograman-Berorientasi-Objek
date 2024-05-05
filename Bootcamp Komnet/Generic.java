/**
 * Nomor12A
 */
public class Generic<T> {
  private T t;

  public T get() {
    return this.t;
  }

  public void set(T t) {
    this.t = t;
  }

  public static void main(String[] args) {
    Generic<Integer> type1 = new Generic<>();
    // type1.set(new Generic<Integer>());
    type1.set(1);

    Object o = type1.get();
    System.out.println(o.getClass().getName());
  }
}
