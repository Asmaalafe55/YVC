package homeTasks.task3;

public class Librarian extends AbstractPerson {

  // Represents a Librarian, inheriting from AbstractPerson.
  public Librarian(
    String name,
    int id,
    String address,
    String phone,
    String email
  ) {
    super(name, id, address, phone, email);
  }

  public Librarian(int memberId) {
    super(
      "Librarian name",
      memberId,
      "Librarian address",
      "0",
      "Librarian email"
    );
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
