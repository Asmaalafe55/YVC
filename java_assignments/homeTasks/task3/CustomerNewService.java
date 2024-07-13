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

  public boolean isSubscribed() {
    return subscribed;
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

  // במתודה זו אנו מחסירים את סכום הכספי מכספו של הלקוח בעקבות איחור בהחזרה של פריט
  public void deductMoney(double amount) {
    // יש לממש

  }
}
