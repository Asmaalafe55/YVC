package homeTasks.task3;

import java.util.Random;
import java.util.Scanner;

// Represents a book with attributes such as name, author, availability, and published year.

public class Book {

  private String name;
  private String author;
  private boolean available;
  private int publishedYear;

  // Constructor to initialize a Book object with specified details.

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

  // Default constructor to initialize a Book object with default values.
  // It prompts the user to enter a year and generates a random 3-digit number for the published year.

  public Book() {
    this.name = "Disney";
    this.author = "";
    this.available = false;

    // Initialize a Scanner object for user input
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter the year of the book: ");
      int userInputYear = scanner.nextInt();
      // Set the published year as the first digit entered multiplied by 1000
      this.publishedYear = userInputYear * 1000;
      scanner.close();
    }

    // Add a random 3-digit number to the published year
    this.publishedYear += generateRandomYear();
  }

  // Generates a random 3-digit number for the published year.

  private int generateRandomYear() {
    Random random = new Random();
    // Generate a random integer from 100 to 999
    return random.nextInt(900) + 100;
  }

  // Getters and setters for Book attributes

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

  // Prints details of the book including name, author, availability, and published year.

  public void printDetails() {
    System.out.println(
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
}
