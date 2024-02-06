/**
 * ResizableCircle
 */
public class ResizableCircle extends Circle implements Resizable {

  ResizableCircle(double radius) {
    super(radius);
  }

  @Override
  public String toString() {
    return "ResizableCircle[" + super.toString() + "]";
  }

  @Override
  public void resize(int percent) {
    radius = radius * percent / 100;
  }
}
