/**
 * BookTest
 */
public class BookTest {

  public static void main(String[] args) {
    Author author1 = new Author("aku", "aku@gmail.com", 'L');
    Author author2 = new Author("kamu", "kamu@gmail.com", 'P');
    Author author3 = new Author("dia", "dia@gmail.com", 'L');

    Author[] authors = new Author[] { author1, author2 };
    Book book1 = new Book("Buku1", authors, 10000, 2);
    System.out.println(book1.getAuthorName());
  }
}
