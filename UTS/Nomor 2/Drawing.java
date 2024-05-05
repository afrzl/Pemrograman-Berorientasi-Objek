/**
 * Drawing
 */
import java.util.*;

public class Drawing {
  public List<Shape> shapes;

  Drawing(List<Shape> shapes) {
    this.shapes = shapes;
  }

  public void addShape(Shape shape) {
    shapes.add(shape);
  }

  public void draw() {}
}
