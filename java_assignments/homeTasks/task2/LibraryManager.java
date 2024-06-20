package homeTasks.task2;

public class LibraryManager {

  private String name;
  private int id;
  private String address;
  private String phone;
  private String email;

  public LibraryManager(
    String name,
    int id,
    String address,
    String phone,
    String email
  ) {
    this.name = name;
    // casting the id to string and getting the length of it
    int length = String.valueOf(id).length();
    if (length == 7) {
      this.id = id;
    } else {
      // if the id's lenght is not equal to 7
      this.id = 0;
    }
    this.address = address;
    this.phone = phone;
    this.email = email;
  }

  public LibraryManager(int memberId) {
    id = memberId;
    this.name = "Library name";
    this.address = "Library address";
    this.phone = "0";
    this.email = "Library email";
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
