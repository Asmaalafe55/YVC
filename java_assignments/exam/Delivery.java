package exam;

public abstract class Delivery {

  protected String codeNumber;
  protected String name;
  protected Postman postman;

  public Delivery(String codeNumber, String name, Postman postman) {
    this.codeNumber = codeNumber;
    this.name = name;
    this.postman = postman;
  }

  public String getCodeNumber() {
    return codeNumber;
  }

  public void setCodeNumber(String codeNumber) {
    this.codeNumber = codeNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Postman getPostman() {
    return postman;
  }

  public void setPostman(Postman postman) {
    this.postman = postman;
  }
}
