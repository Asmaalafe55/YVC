package homeTasks.task2;

public class Librarian {

  private String name;
  private int id;
  private String address;
  private String phoneNumber;
  public String email;

  public Librarian(
    String name,
    int id,
    String address,
    String phoneNumber,
    String email
  ) {
    this.name = name;
    this.id = id;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.email = email;
  }

  public Librarian(int id) {
    this.id = id;
    this.name = "Librarian name";
    this.address = "Librarian address";
    this.phoneNumber = "000";
    this.email = "Librarian email";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
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
      ", email=" +
      email +
      "]"
    );
  }
}
