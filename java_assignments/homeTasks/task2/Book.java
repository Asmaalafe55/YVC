package homeTasks.task2;

import java.util.Random;
import java.util.Scanner;

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
    try ( // initializing a Scanner object
      Scanner scanner = new Scanner(System.in)
    ) {
      System.out.println("Enter the year of the book: ");
      int x = scanner.nextInt();
      // needs to get the first digit from the user
      this.publishedYear = x * 1000;
      scanner.close();
    }
    this.publishedYear += generateRandomYear();
  }

  private int generateRandomYear() {
    // initializing a Random object
    Random random = new Random();

    // generating a random integer from 0 to 899, then add 100
    int x = random.nextInt(900) + 100;
    return x; // needs to get rendom number of 3 digits
  }

  @Override
  public String toString() {
    return (
      "Book: [name=" +
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
