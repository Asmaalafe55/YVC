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
    if (id % 1000000 == 2 && id % 10000000 != 0) { // i have to check if the id contains 7 digits and the seconed digit is equals 2
      this.id = id;
    } else {
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
}
