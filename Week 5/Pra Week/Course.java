/**
 * Course
 */
public class Course {
  private int id;
  private String name;
  private float hours;
  private ResearchAssociate lecturer;

  Course(int id, String name, float hours, ResearchAssociate lecturer) {
    this.id = id;
    this.name = name;
    this.hours = hours;
    this.lecturer = lecturer;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getHours() {
    return hours;
  }

  public void setHours(float hours) {
    this.hours = hours;
  }

  public ResearchAssociate getLecturer() {
    return lecturer;
  }

  public void setLecturer(ResearchAssociate lecturer) {
    this.lecturer = lecturer;
  }

  @Override
  public String toString() {
    return (
      "Course[id=" +
      id +
      ", name=" +
      name +
      ", hours=" +
      hours +
      ", Lecturer=" +
      lecturer +
      "]"
    );
  }
}
