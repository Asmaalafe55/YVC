package homeTasks.task3;

// Represents a specific type of library item, a book.
// Inherits attributes from LibraryItem and provides a specific toString() method.

public class BookItem extends LibraryItem {

  // Constructor to initialize a BookItem with artist, year published, and genre.

  public BookItem(String artist, int yearPublished, String genre) {
    // Call the constructor of LibraryItem with provided parameters
    super(artist, yearPublished, genre);
  }

  // Overrides the toString() method to provide a formatted string representation of a BookItem.

  @Override
  public String toString() {
    return (
      "BookItem [artist=" +
      artist +
      ", yearPublished=" +
      yearPublished +
      ", genre=" +
      genre +
      "]"
    );
  }
}
