package homeTasks.task3;

public class CustomerNewService {

  private int id;
  private double money;
  private boolean subscribed;

  public CustomerNewService(int id, double money) {
    this.id = id;
    this.money = money;
    this.subscribed = false;
  }

  public int getId() {
    return id;
  }

  public boolean registerForService(double minAmount) {
    if (minAmount >= 50) {
      this.subscribed = true;
      return true;
    }
    return false;
  }

  public void removeSubscription(int id) {
    if (id == this.id) {
      subscribed = false;
      System.out.println("Removed");
    }
    System.out.println("Costumer not found");
  }

  public double getMoney() {
    return money;
  }

  public void deductMoney(double amount) {
    this.money -= amount;
    if (this.money < 0) {
      this.money = 0;
    }
  }

  public boolean isSubscribed() {
    return subscribed;
  }

  public void unsubscribe() {
    this.subscribed = false;
  }
}
