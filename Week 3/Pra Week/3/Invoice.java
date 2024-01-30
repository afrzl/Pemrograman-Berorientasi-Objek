/**
 * Invoice
 */
public class Invoice {
  private int id;
  private Customer3 customer;
  private double amount;

  Invoice(int id, Customer3 customer, double amount) {
    this.id = id;
    this.customer = customer;
    this.amount = amount;
  }

  public int getId() {
    return id;
  }

  public Customer3 getCustomer() {
    return customer;
  }

  public void setCustomer(Customer3 customer) {
    this.customer = customer;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public int getCustomerId() {
    return customer.getId();
  }

  public String getCustomerName() {
    return customer.getName();
  }

  public int getCustomerDiscount() {
    return customer.getDiscount();
  }

  public double getAmountAfterDiscount() {
    return (double) amount - amount * getCustomerDiscount() / 100;
  }

  public String toString() {
    return (
      "Invoice[id=" +
      id +
      ", customer=" +
      getCustomerName() +
      "(" +
      getCustomerId() +
      ")(" +
      getCustomerDiscount() +
      "%), amount=" +
      getAmountAfterDiscount() +
      "]"
    );
  }
}
