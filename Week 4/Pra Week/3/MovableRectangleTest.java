/**
 * MovableRectangleTest
 */
public class MovableRectangleTest {

  public static void main(String[] args) {
    Movable rect = new MovableRectangle(1, 1, 6, 6, 3, 2);
    System.out.println("Posisi awal: " + rect);

    rect.moveDown();
    rect.moveDown();
    rect.moveLeft();

    System.out.println("Posisi akhir: " + rect);
  }
}
