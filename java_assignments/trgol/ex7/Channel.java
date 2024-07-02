package trgol.ex7;

import java.util.Locale;
import java.util.Random;

public abstract class Channel {

  private String name;

  enum BoardCatType {
    SECAM,
    PAL,
    NTSC,
  }

  private BoardCatType btype;
  private String receptionArea;

  private String onLineDate;

  public Channel(String name) {
    this.name = name;
    Random r = new Random();
    int type = r.nextInt();

    switch (type % 3) {
      case 0:
        btype = BoardCatType.PAL;
        break;
      case 1:
        btype = BoardCatType.NTSC;
        break;
      case 2:
        btype = BoardCatType.SECAM;
        break;
    }

    type = r.nextInt();
    String[] possibleCountries = Locale.getISOCountries();
    receptionArea = possibleCountries[type % possibleCountries.length];
  }
}
