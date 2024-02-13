/**
 * Project
 */
import java.time.LocalDate;

public class Project {
  private String name;
  private float hours;
  private LocalDate start;
  private LocalDate end;
  private ResearchAssociate researchAssociate;

  Project(
    String name,
    float hours,
    LocalDate start,
    LocalDate end,
    ResearchAssociate research
  ) {
    this.name = name;
    this.hours = hours;
    this.start = start;
    this.end = end;
    this.researchAssociate = research;
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

  public LocalDate getStart() {
    return start;
  }

  public void setStart(LocalDate start) {
    this.start = start;
  }

  public LocalDate getEnd() {
    return end;
  }

  public void setEnd(LocalDate end) {
    this.end = end;
  }

  @Override
  public String toString() {
    return (
      "Project[name=" +
      name +
      ", hours=" +
      hours +
      ", start=" +
      start +
      ", end=" +
      end +
      ", ResearchAssociation=" +
      researchAssociate +
      "]"
    );
  }
}
