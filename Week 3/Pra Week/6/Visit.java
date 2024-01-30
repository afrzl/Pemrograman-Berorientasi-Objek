/**
 * Visit
 */
import java.time.LocalDate;

public class Visit {
  private Customer customer;
  private LocalDate date;
  private double serviceExpense;
  private double productExpense;

  Visit(Customer customer, LocalDate date) {
    this.customer = customer;
    this.date = date;
  }

  public String getName() {
    return customer.getName();
  }

  public double getServiceExpense() {
    return serviceExpense;
  }

  public void setServiceExpense(double serviceExpense) {
    this.serviceExpense = serviceExpense;
  }

  public double getProductExpense() {
    return productExpense;
  }

  public void setProductExpense(double productExpense) {
    this.productExpense = productExpense;
  }

  public double getTotalExpense() {
    return getServiceExpense() + getProductExpense();
  }

  public double getTotalExpenseAfterDiscount() {
    return (
      (
        getServiceExpense() *
        (1 - DiscountRate.getServiceDiscountRate(customer.getMemberType()))
      ) +
      (
        getProductExpense() *
        (1 - DiscountRate.getProductDiscountRate(customer.getMemberType()))
      )
    );
  }

  public String toString() {
    String text =
      "Customer[" +
      customer +
      ", date=" +
      date +
      ", serviceExpense=" +
      serviceExpense;
    if (customer.isMember()) {
      text +=
        ", serviceDiscount=" +
        DiscountRate.getServiceDiscountRate(customer.getMemberType()) *
        100 +
        "%";
    }
    text += ", productExpense=" + productExpense;
    if (customer.isMember()) {
      text +=
        ", productDiscount=" +
        DiscountRate.getProductDiscountRate(customer.getMemberType()) *
        100 +
        "%";
    }
    text += ", totalExpense=" + getTotalExpense();
    if (customer.isMember()) {
      text += ", totalExpenseAfterDiscount=" + getTotalExpenseAfterDiscount();
    }
    text += "]";

    return text;
  }
}
