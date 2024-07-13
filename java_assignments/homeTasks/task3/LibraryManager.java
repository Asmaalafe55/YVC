package homeTasks.task3;

public class LibraryManager extends AbstractPerson {

  public LibraryManager(
    String name,
    int id,
    String address,
    String phone,
    String email
  ) {
    super(name, validateId(id), address, phone, email);
  }

  public LibraryManager(int memberId) {
    super(
      "Library Manager",
      validateId(memberId),
      "Default Library Address",
      "0",
      "librarymanager@example.com"
    );
  }

  // Method to validate ID (ensures ID length is exactly 7 digits)
  private static int validateId(int id) {
    int length = String.valueOf(id).length();
    if (length == 7) {
      return id;
    } else {
      return 0; // Return default ID or handle error as needed
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return (
      "LibraryManager: [name=" +
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
