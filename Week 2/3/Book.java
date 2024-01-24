/**
 * Book
 */
public class Book {
  private String name;
  private Author[] authors;
  private double price;
  private int qty;

  public Book(String name, Author[] authors, double price) {
    this.name = name;
    this.authors = authors;
    this.price = price;
    this.qty = 1;
  }

  public Book(String name, Author[] authors, double price, int qty) {
    this.name = name;
    this.authors = authors;
    this.price = price;
    this.qty = qty;
  }

  public String getName() {
    return this.name;
  }

  public Author[] getAuthors() {
    return this.authors;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQty() {
    return this.qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public String toString() {
    return (
      "Book[name=" +
      name +
      ", author=" +
      authors.toString() +
      ", price=" +
      price +
      ", qty=" +
      qty +
      "]"
    );
  }

  public String getAuthorName() {
    String text = "";
    for (Author author : authors) {
      text += author.getName() + ", ";
    }
    return text;
  }
}
