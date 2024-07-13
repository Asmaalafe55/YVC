package homeTasks.task3;

// Represents a Customer, extending AbstractPerson.

public class Customer extends AbstractPerson {

  // Constructor for initializing a Customer with name, id, address, phone, and email.

  public Customer(
    String name,
    int id,
    String address,
    String phone,
    String email
  ) {
    super(name, id, address, phone, email); // Call to superclass constructor
  }

  // Constructor for initializing a Customer with memberId.
  // Uses default values for name, address, phone, and email.

  public Customer(int memberId) {
    super("Customer name", memberId, "Customer address", "0", "Customer email"); // Call to superclass constructor
  }

  // Method to add a phone number for the Customer.
  // Validates that the phone number has exactly 10 digits.
  // phone The phone number to add.
  // return true if the phone number is valid and added, false otherwise.

  public boolean addPhoneNumber(String phone) {
    if (phone.length() != 10) {
      System.out.println(
        "The phone number you provided does not contain 10 digits!"
      );
      return false;
    }
    this.phone = phone; // Set the phone number
    return true;
  }

  // Getters and setters for Customer attributes
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

  // Override of toString method to provide a string representation of Customer.
  // return String representation of Customer object.

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
