package homeTasks.task3;

public class Customer implements Person {

  private String name;
  private int id;
  private String address;
  private String phone;
  private String email;

  public Customer(
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

  public Customer(int memberId) {
    this.name = "Customer name";
    id = memberId;
    this.address = "Customer address";
    this.phone = "0";
    this.email = "Customer email";
  }

  public boolean addPhoneNumber(String phone) {
    if (phone.length() != 10) {
      System.out.println(
        "The phone number you provided does not contain 10 digits!"
      );
      return false;
    }
    this.phone = phone;
    return true;
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
      "Customer: [name=" +
      name +
      ", id=" +
      id +
      ", address=" +
      address +
      ", phone=" +
      phone +
      ", email=" +
      email +
      "\n]"
    );
  }

  @Override
  public boolean isValidId(int id) {
    return id == this.id ? true : false;
  }

  @Override
  public boolean isValidPhone(String phone) {
    return phone == this.phone ? true : false;
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
