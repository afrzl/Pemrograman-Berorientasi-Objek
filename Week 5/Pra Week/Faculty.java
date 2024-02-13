/**
 * Faculty
 */
public class Faculty {
  private String name;
  private Institute institutes[];
  private Employee dean;

  Faculty(String name) {
    this.name = name;
  }

  Faculty(String name, Institute[] institutes, Employee dean) {
    this.name = name;
    this.institutes = institutes;
    this.dean = dean;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Institute[] getInstitutes() {
    return institutes;
  }

  public void setInstitutes(Institute[] institutes) {
    this.institutes = institutes;
  }

  public Employee getDean() {
    return dean;
  }

  public void setDean(Employee dean) {
    this.dean = dean;
  }

  @Override
  public String toString() {
    String text = "Faculty[name=" + name + ", \n";
    for (Institute institute : institutes) {
      text += "\t" + institute.toString() + ", \n";
    }
    text += "Dean[" + dean + "]]";

    return text;
  }
}
