package homeTasks.task3;

public abstract class AbstractPerson implements Person, Display {

  protected String name;
  protected int id;
  protected String address;
  protected String phone;
  protected String email;

  // Constructor to initialize a person with specified attributes.
  public AbstractPerson(
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

  // Prints details of the person including name, ID, address, phone, and email.
  @Override
  public void printDetails() {
    System.out.println(
      "Name: " +
      name +
      ", Id: " +
      id +
      ", Address: " +
      address +
      ", Phone: " +
      phone +
      ", Email: " +
      email
    );
  }

  // Validates if the provided ID matches the ID of the person.
  @Override
  public boolean isValidId(int id) {
    try {
      if (id != this.id) {
        throw new InvalidPersonDataException("Invalid id number: " + id);
      }
      return true;
    } catch (InvalidPersonDataException e) {
      System.out.println(e.getMessage()); // Handle invalid ID exception
      return false;
    }
  }

  // Validates if the provided phone number matches the phone number of the person.
  @Override
  public boolean isValidPhone(String phone) {
    try {
      if (phone == null || !phone.equals(this.phone)) {
        throw new InvalidPersonDataException("Invalid phone number: " + phone);
      }
      return true;
    } catch (InvalidPersonDataException e) {
      System.out.println(e.getMessage()); // Handle invalid phone number exception
      return false;
    }
  }

  // Validates if the provided email matches the email address of the person.
  @Override
  public boolean isValidEmail(String email) {
    try {
      if (email == null || !email.equals(this.email)) {
        throw new InvalidPersonDataException("Invalid email: " + email);
      }
      return true;
    } catch (InvalidPersonDataException e) {
      System.out.println(e.getMessage()); // Handle invalid email exception
      return false;
    }
  }

  // Validates if the provided name matches the name of the person.
  @Override
  public boolean isValidName(String name) {
    try {
      if (name == null || !name.equals(this.name)) {
        throw new InvalidPersonDataException("Invalid name: " + name);
      }
      return true;
    } catch (InvalidPersonDataException e) {
      System.out.println(e.getMessage()); // Handle invalid name exception
      return false;
    }
  }

  // Validates if the provided address matches the address of the person.
  @Override
  public boolean isValidAddress(String address) {
    try {
      if (address == null || !address.equals(this.address)) {
        throw new InvalidPersonDataException("Invalid address: " + address);
      }
      return true;
    } catch (InvalidPersonDataException e) {
      System.out.println(e.getMessage()); // Handle invalid address exception
      return false;
    }
  }
}
