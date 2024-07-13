package homeTasks.task3;

public class MovieItem extends LibraryItem {

  public MovieItem(String artist, int yearPublished, String genre) {
    super(artist, yearPublished, genre);
  }

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
