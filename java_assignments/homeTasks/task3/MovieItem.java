package homeTasks.task3;

public class MovieItem extends LibraryItem {

  // Constructor to initialize a movie item with artist, year published, and genre
  public MovieItem(String artist, int yearPublished, String genre) {
    super(artist, yearPublished, genre); // Call to superclass constructor to initialize attributes
  }

  // Override of toString method to provide a string representation of the movie item
  @Override
  public String toString() {
    return (
      "MovieItem [artist=" +
      artist +
      ", yearPublished=" +
      yearPublished +
      ", genre=" +
      genre +
      "]"
    );
  }
}
