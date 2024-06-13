package homeTasks.task2;

public class Librarian {

  private String name;
  private int id;
  private String address;
  private int phoneNumber;
  public String mail;

  public Librarian(
    String name,
    int id,
    String address,
    int phoneNumber,
    String mail
  ) {
    this.name = name;
    this.id = id;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.mail = mail;
  }

  public Librarian(int id) {
    this.id = id;
    this.name = "Librarian name";
    this.address = "Librarian address";
    this.phoneNumber = 0;
    this.mail = "Librarian mail";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString() {
    return (
      "Librarian [name=" +
      name +
      ", id=" +
      id +
      ", address=" +
      address +
      ", phoneNumber=" +
      phoneNumber +
      ", mail=" +
      mail +
      "]"
    );
  }
}
