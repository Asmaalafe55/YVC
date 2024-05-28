package trgol.ex5;

public class CardAccount_Q3 {

  private String ownerName;
  private String cardNumber;
  private double balance;

  public CardAccount_Q3(String ownerName, String cardNumber) {
    this.ownerName = ownerName;
    this.cardNumber = cardNumber;
    balance = 0;
  }

  public CardAccount_Q3(String ownerName, String cardNumber, double balance) {
    this.ownerName = ownerName;
    this.cardNumber = cardNumber;
    this.balance = balance;
  }

  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public boolean deposit(double amount) {
    balance += amount;
    return true;
  }

  public boolean withdrawal(double amount) {
    if ((balance - amount) < 0) {
      return false;
    } else {
      balance -= amount;
      return true;
    }
  }

  public void display() {
    System.out.println("The name of the owner: " + ownerName);
    System.out.println("The card number: " + cardNumber);
    System.out.println("The balance: " + balance);
  }
}
