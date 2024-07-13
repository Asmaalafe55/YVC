package homeTasks.task3;

// Define the BorrowAndReturn class
public class BorrowAndReturn {

  private int itemId;
  private boolean borrowed;
  private int daysToBorrow;

  public BorrowAndReturn(int itemId) {
    this.itemId = itemId;
    this.borrowed = false;
    this.daysToBorrow = 0;
  }

  public boolean borrowItem(int itemId, int daysToBorrow) {
    if (!borrowed) {
      this.borrowed = true;
      this.daysToBorrow = daysToBorrow;
      return true;
    } else {
      return false;
    }
  }

  public boolean returnItem(
    int itemId,
    int daysLate,
    CustomerNewService customer
  ) {
    if (borrowed && this.itemId == itemId) {
      double fine = calculateFine(daysLate);
      if (customer.getBalance() >= fine) {
        customer.deductBalance(fine);
        this.borrowed = false;
        this.daysToBorrow = 0;
        return true;
      } else {
        customer.unsubscribe();
        return false;
      }
    } else {
      return false;
    }
  }

  // Method to calculate the fine based on the number of days late
  private double calculateFine(int daysLate) {
    if (daysLate > 10) {
      return 60.0;
    } else if (daysLate > 5) {
      return 30.0;
    } else {
      return 0.0;
    }
  }
}
