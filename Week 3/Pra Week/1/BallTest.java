/**
 * BallTest
 */
public class BallTest {

  public static void main(String[] args) {
    Ball ball1 = new Ball(10, 15, 20, 5, 5);
    System.out.println("Posisi awal: ");
    System.out.println(ball1);

    ball1.setYDelta(-2);
    ball1.move();
    System.out.println("Setelah move: ");
    System.out.println(ball1);

    ball1.reflectHorizontal();
    ball1.move();
    System.out.println("Setelah reflect horizontal dan move: ");
    System.out.println(ball1);
  }
}
