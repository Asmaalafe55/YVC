package homeTasks.task2;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    // יצירת אובייקט ספרייה
    Library library = new Library();

    // יצירת ספרים
    Book book1 = new Book("Java Programming", "John Doe", true, 2020);
    Book book2 = new Book();
    Book book3 = new Book("Python Programming", "Jane Smith", true, 2018);

    //  הוספת ספרים לספרייה
    System.out.println(library.addBook(book1)); // true
    System.out.println(library.addBook(book2)); // true
    System.out.println(library.addBook(book3)); // true
    //  ספר קיים
    System.out.println(library.addBook(book1)); // false

    // יצירת לקוחות//
    Customer customer1 = new Customer(
      "Alice",
      1,
      "123 Street",
      "1234567890",
      "alice@example.com"
    );
    Customer customer2 = new Customer(
      "Bob",
      2,
      "456 Avenue",
      "9876543210",
      "bob@example.com"
    );
    Customer customer3 = new Customer(3);

    //  הוספת לקוחות לספרייה
    System.out.println(library.addCustomer(customer1)); // true
    System.out.println(library.addCustomer(customer2)); // true
    System.out.println(library.addCustomer(customer3)); // true
    //  כי הלקוח כבר קיים
    System.out.println(library.addCustomer(customer1)); // false

    //  יצירת ספרנים
    Librarian librarian1 = new Librarian(
      "Charlie",
      1,
      "789 Road",
      "555123456",
      "charlie@example.com"
    );
    Librarian librarian2 = new Librarian(2);

    //  יצירת מנהלי ספרייה
    LibraryManager manager1 = new LibraryManager(
      "Dave",
      4234594,
      "101 Blvd",
      "555987654",
      "dave@example.com"
    );
    LibraryManager manager2 = new LibraryManager(5);

    // הוספת ספרנים ומנהלים לספרייה//
    // library.librarians.add(librarian1);
    // library.librarians.add(librarian2);
    // library.libraryManagers.add(manager1);
    // library.libraryManagers.add(manager2);

    // השוואת מספר הלקוחות למספר המנהלים
    library.findHighestlCustomersOrLibraryManager();
  }
}
