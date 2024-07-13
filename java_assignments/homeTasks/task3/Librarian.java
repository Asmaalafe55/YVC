package homeTasks.task3;

public class Librarian implements Person {

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
    this.name = "Librarian name";
    this.id = id;
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
      "Librarian: [name=" +
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

  @Override
  public boolean isValidId(int id) {
    return id == this.id ? true : false;
  }

  @Override
  public boolean isValidPhone(String phone) {
    return phone == phoneNumber ? true : false;
  }

  @Override
  public boolean isValidEmail(String email) {
    return email == this.email ? true : false;
  }

  @Override
  public boolean isValidName(String name) {
    return name == this.name ? true : false;
  }

  @Override
  public boolean isValidAddress(String address) {
    return address == this.address ? true : false;
  }
}
