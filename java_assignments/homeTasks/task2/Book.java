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
}
