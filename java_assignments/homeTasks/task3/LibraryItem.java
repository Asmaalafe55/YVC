package homeTasks.task3;

public class LibraryItem {

  // Attributes to store details of the library item
  protected String artist; // Artist or creator of the item
  protected int yearPublished; // Year when the item was published or released
  protected String genre; // Genre or category of the item

  // Constructor to initialize the library item with artist, year published, and genre
  public LibraryItem(String artist, int yearPublished, String genre) {
    this.artist = artist;
    this.yearPublished = yearPublished;
    this.genre = genre;
  }
}
