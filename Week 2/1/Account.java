/**
 * Account
 */
public class Account {
  private String id;
  private String name;
  private int balance;

  public Account(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public Account(String id, String name, int balance) {
    this.id = id;
    this.name = name;
    this.balance = balance;
  }

  public String getID() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public int getBalance() {
    return this.balance;
  }

  public int credit(int amount) {
    this.balance += amount;
    return this.balance;
  }

  public int debit(int amount) {
    if (amount <= this.balance) {
      System.out.println("Subtract amount from balance");
      this.balance -= amount;
    }

    System.out.println("Amount exceeded balance");
    return this.balance;
  }

  public int transferTo(Account another, int amount) {
    if (amount <= this.balance) {
      System.out.println("Transfer amount to the given account");
      this.balance -= amount;
      another.balance += amount;
    }

    System.out.println("Amount exceeded balance");
    return this.balance;
  }

  public String toString() {
    return (
      "Acccount[id=" +
      this.id +
      ", name=" +
      this.name +
      ", balance=" +
      this.balance +
      "]"
    );
  }
}
