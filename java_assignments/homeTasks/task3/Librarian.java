package homeTasks.task3;

public class Librarian extends AbstractPerson {

  private String name;
  private int id;
  private String address;
  private String phone;
  public String email;

  public Librarian(
    String name,
    int id,
    String address,
    String phone,
    String email
  ) {
    this.name = name;
    this.id = id;
    this.address = address;
    this.phone = phone;
    this.email = email;
  }

  public Librarian(int id) {
    this.name = "Librarian name";
    this.id = id;
    this.address = "Librarian address";
    this.phone = "000";
    this.email = "Librarian email";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
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
      ", phone=" +
      phone +
      ", email=" +
      email +
      "]"
    );
  }
}
