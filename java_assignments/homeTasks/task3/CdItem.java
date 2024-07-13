package homeTasks.task3;

public class CdItem extends LibraryItem {

  public CdItem(String artist, int yearPublished, String genre) {
    super(artist, yearPublished, genre);
  }

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
