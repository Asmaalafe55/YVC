package homeTasks.task3;

public class BookItem extends LibraryItem {

  public BookItem(String artist, int yearPublished, String genre) {
    super(artist, yearPublished, genre);
  }

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
