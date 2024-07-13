package homeTasks.task3;

// Represents the borrowing and returning of library items, with fine calculation for late returns.

public class BorrowAndReturn {

  private int itemId; // Identifier of the item being borrowed
  private boolean borrowed; // Flag indicating if the item is currently borrowed
  private int daysToBorrow; // Number of days the item is borrowed for

  // Constructor to initialize BorrowAndReturn with an item ID.

  public BorrowAndReturn(int itemId) {
    this.itemId = itemId;
    this.borrowed = false; // Initially not borrowed
    this.daysToBorrow = 0; // Default days to borrow
  }

  // Method to borrow an item for a specified number of days.
  // Returns true if the item was successfully borrowed; false otherwise.

  public boolean borrowItem(int itemId, int daysToBorrow) {
    if (!borrowed) { // Check if item is not already borrowed
      this.borrowed = true; // Mark item as borrowed
      this.daysToBorrow = daysToBorrow; // Set days to borrow
      return true;
    } else {
      return false; // Item already borrowed
    }
  }

  // Method to return an item, calculating fines for late returns based on days late.
  // Returns true if the item was successfully returned; false otherwise.

  public boolean returnItem(
    int itemId,
    int daysLate,
    CustomerNewService customer
  ) {
    if (borrowed && this.itemId == itemId) { // Check if item is borrowed and matches itemId
      double fine = calculateFine(daysLate); // Calculate fine based on days late
      if (customer.getMoney() >= fine) { // Check if customer can pay the fine
        customer.deductMoney(fine); // Deduct fine from customer's money
        this.borrowed = false; // Mark item as returned
        this.daysToBorrow = 0; // Reset days to borrow
        return true;
      } else {
        customer.removeSubscription(customer.getId()); // Remove subscription if unable to pay fine
        return false; // Unable to return item due to insufficient funds
      }
    } else {
      return false; // Item not borrowed or itemId does not match
    }
  }

  // Method to calculate the fine based on the number of days late.
  // Fines are $0 for up to 5 days late, $30 for 6-10 days late, and $60 for more than 10 days late.

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
