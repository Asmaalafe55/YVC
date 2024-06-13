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
}
