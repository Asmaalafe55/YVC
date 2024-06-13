package homeTasks.task2;

public class Customer {

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
    id = memberId;
    this.name = "Customer name";
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
    return true;
  }

  // public boolean equals(Customer c) {
  //   if (c == null) return false;
  //   if (this.id != c.getId()) return false;
  //   return true;
  // }

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
