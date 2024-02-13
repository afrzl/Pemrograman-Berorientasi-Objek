/**
 * Employee
 */
public abstract class Employee {
  private int ssNo;
  private String name;
  private String email;

  Employee(int ssNo, String name, String email) {
    this.ssNo = ssNo;
    this.name = name;
    this.email = email;
  }

  public int getSsNo() {
    return ssNo;
  }

  public void setSsNo(int ssNo) {
    this.ssNo = ssNo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return (
      "Employee[ssNo=" + ssNo + ", name=" + name + ", email=" + email + "]"
    );
  }
}
