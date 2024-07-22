package exam;

import java.util.ArrayList;

public class ZoneManager extends Postman {

  protected String zone;
  protected ArrayList<Delivery> de;

  public ZoneManager(int number, String name, String zone) {
    super(number, name);
    this.zone = zone;
    this.de = new ArrayList<Delivery>();
  }

  public ArrayList<Postman> function(
    ArrayList<String> codes,
    ArrayList<ZoneManager> managers
  ) {
    ArrayList<Postman> p = new ArrayList<Postman>();

    for (Delivery d : de) {
      for (ZoneManager manager : managers) {
        if (manager.getDe().getCodeNumber().equals(d)) {
          p.add();
        }
      }
    }

    return p;
  }

  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }

  public ArrayList<Delivery> getDe() {
    return de;
  }

  public void setDe(ArrayList<Delivery> de) {
    this.de = de;
  }
}
