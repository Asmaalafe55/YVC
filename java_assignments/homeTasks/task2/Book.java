package homeTasks.task2;

public class Book {

  private String name;
  private String author;
  private boolean available;
  public int publishedYear;

  public Book(
    String name,
    String author,
    boolean available,
    int publishedYear
  ) {
    this.name = name;
    this.author = author;
    this.available = available;
    this.publishedYear = publishedYear;
  }

  public Book() {
    this.name = "Disney";
    this.author = "";
    this.available = false;

    // needs to get the first digit from the user !!
    // num = scanner.nextInt();
    // this.publishedYear = num*1000;

    this.publishedYear += generateRandomYear();
  }

  private int generateRandomYear() {
    return 111; // needs to get rendom number of 3 digits
  }

  @Override
  public String toString() {
    return (
      "Book [name=" +
      name +
      ", author=" +
      author +
      ", available=" +
      available +
      ", publishedYear=" +
      publishedYear +
      "]"
    );
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public boolean isAvailable() {
    return available;
  }

  public void setAvailable(boolean available) {
    this.available = available;
  }

  public int getPublishedYear() {
    return publishedYear;
  }

  public void setPublishedYear(int publishedYear) {
    this.publishedYear = publishedYear;
  }
}
