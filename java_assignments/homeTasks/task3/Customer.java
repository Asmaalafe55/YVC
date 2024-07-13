package homeTasks.task3;

public class Customer extends AbstractPerson {

  public Customer(
    String name,
    int id,
    String address,
    String phone,
    String email
  ) {
    super(name, id, address, phone, email);
  }

  public Customer(int memberId) {
    super("Customer name", memberId, "Customer address", "0", "Customer email");
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
}
