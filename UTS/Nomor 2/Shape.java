/**
 * Shape
 */
public abstract class Shape {
  private String color;

  abstract void draw();

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
