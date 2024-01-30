/**
 * Customer_6
 */
public class Customer_6 {
  private String name;
  private boolean member;
  private String memberType;

  Customer_6(String name) {
    this.name = name;
    member = false;
  }

  public String getName() {
    return name;
  }

  public boolean isMember() {
    return member;
  }

  public void setMember(boolean member) {
    this.member = member;
  }

  public String getMemberType() {
    return memberType;
  }

  public void setMemberType(String memberType) {
    this.memberType = memberType;
  }

  public String toString() {
    return (
      "[name=" +
      name +
      ", member=" +
      member +
      ", memberType=" +
      memberType +
      "]"
    );
  }
}
