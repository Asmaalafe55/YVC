package homeTasks.task3;

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
    // יש לממש
  }

  public boolean returnItem(
    int itemId,
    int daysLate,
    CustomerNewService customer
  ) {
    // יש לממש

  }

  //  מתודה זו מחשבת את סכום הקנס של הלקוח במקרה של איחור בהחזרת הפריט
  private double calculateFine(int daysLate) {
    // יש לממש

  }
}
