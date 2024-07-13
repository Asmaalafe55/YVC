package homeTasks.task3;

public abstract class AbstractPerson implements Person, Display {

  private String name;
  private int id;
  private String address;
  private String phone;
  private String email;

  @Override
  public void printDetails() {
    System.out.println(
      "Name:" +
      name +
      "Id:" +
      id +
      "address:" +
      address +
      "Phone:" +
      phone +
      "Email:" +
      email
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
