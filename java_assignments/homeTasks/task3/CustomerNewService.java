package homeTasks.task3;

// Represents a Customer Service for managing subscriptions and money.
public class CustomerNewService {

  private int id;
  private double money;
  private boolean subscribed;

  // Constructor for initializing a CustomerNewService with id and initial money.
  //  id The customer ID.
  //  money The initial amount of money.

  public CustomerNewService(int id, double money) {
    this.id = id;
    this.money = money;
    this.subscribed = false;
  }

  // Method to get the customer's ID.
  // return The customer's ID.

  public int getId() {
    return id;
  }

  // Method to register the customer for a service.
  // minAmount The minimum amount required to subscribe.
  // return true if successfully registered, false otherwise.

  public boolean registerForService(double minAmount) {
    if (minAmount >= 50) {
      this.subscribed = true;
      return true;
    }
    return false;
  }

  // Method to remove the customer's subscription.
  // id The customer ID to remove subscription for.

  public void removeSubscription(int id) {
    if (id == this.id) {
      subscribed = false;
      System.out.println("Subscription removed for customer with ID: " + id);
    } else {
      System.out.println("Customer not found with ID: " + id);
    }
  }

  // Method to get the current amount of money the customer has.
  // return The current amount of money.

  public double getMoney() {
    return money;
  }

  // Method to deduct money from the customer's balance.
  // amount The amount to deduct.

  public void deductMoney(double amount) {
    this.money -= amount;
    if (this.money < 0) {
      this.money = 0;
    }
  }

  // Method to check if the customer is currently subscribed.
  // return true if subscribed, false otherwise.

  public boolean isSubscribed() {
    return subscribed;
  }

  // Method to unsubscribe the customer from the service.

  public void unsubscribe() {
    this.subscribed = false;
  }
}
