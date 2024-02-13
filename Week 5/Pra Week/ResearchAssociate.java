/**
 * ResearchAssociate
 */
public class ResearchAssociate extends Employee {
  private String fieldOfStudy;
  private Institute[] institutes;

  ResearchAssociate(int ssNo, String name, String email, String fieldOfStudy) {
    super(ssNo, name, email);
    this.fieldOfStudy = fieldOfStudy;
  }

  public String getFieldOfStudy() {
    return fieldOfStudy;
  }

  public void setFieldOfStudy(String fieldOfStudy) {
    this.fieldOfStudy = fieldOfStudy;
  }

  public Institute[] getInstitutes() {
    return institutes;
  }

  public void setInstitutes(Institute[] institutes) {
    this.institutes = institutes;
  }

  @Override
  public String toString() {
    String institutesText = "";
    for (Institute institute : institutes) {
      institutesText += institute.toString();
    }
    return (
      "ResearchAssociate[" +
      super.toString() +
      ", institute=" +
      institutesText +
      "],"
    );
  }
}
