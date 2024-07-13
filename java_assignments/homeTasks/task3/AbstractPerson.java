package homeTasks.task3;

public abstract class AbstractPerson implements Person, Display {

  protected String name;
  protected int id;
  protected String address;
  protected String phone;
  protected String email;

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

  @Override
  public boolean isValidId(int id) {
    try {
      if (id != this.id) {
        throw new InvalidPersonDataException("Invalid id number: " + id);
      }
      return true;
    } catch (InvalidPersonDataException e) {
      System.out.println(e.getMessage());
      return false;
    }
  }

  @Override
  public boolean isValidPhone(String phone) {
    try {
      if (phone == null || !phone.equals(this.phone)) {
        throw new InvalidPersonDataException("Invalid phone number: " + phone);
      }
      return true;
    } catch (InvalidPersonDataException e) {
      System.out.println(e.getMessage());
      return false;
    }
  }

  @Override
  public boolean isValidEmail(String email) {
    try {
      if (email == null || !email.equals(this.email)) {
        throw new InvalidPersonDataException("Invalid email: " + email);
      }
      return true;
    } catch (InvalidPersonDataException e) {
      System.out.println(e.getMessage());
      return false;
    }
  }

  @Override
  public boolean isValidName(String name) {
    try {
      if (name == null || !name.equals(this.name)) {
        throw new InvalidPersonDataException("Invalid name: " + name);
      }
      return true;
    } catch (InvalidPersonDataException e) {
      System.out.println(e.getMessage());
      return false;
    }
  }

  @Override
  public boolean isValidAddress(String address) {
    try {
      if (address == null || !address.equals(this.address)) {
        throw new InvalidPersonDataException("Invalid address: " + address);
      }
      return true;
    } catch (InvalidPersonDataException e) {
      System.out.println(e.getMessage());
      return false;
    }
  }
}
