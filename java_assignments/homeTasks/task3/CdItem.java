package homeTasks.task3;

// Represents a CD item extending LibraryItem.

public class CdItem extends LibraryItem {

  // Constructor for initializing a CD item with artist, year published, and genre.

  public CdItem(String artist, int yearPublished, String genre) {
    super(artist, yearPublished, genre); // Call to superclass constructor
  }

  // Override of toString method to provide a string representation of CdItem.

  @Override
  public String toString() {
    return (
      "CdItem [artist=" +
      artist +
      ", yearPublished=" +
      yearPublished +
      ", genre=" +
      genre +
      "]"
    );
  }
}
