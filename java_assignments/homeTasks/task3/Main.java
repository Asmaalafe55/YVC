package homeTasks.task3;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    Library library = new Library();

    Book book1 = new Book("Java Programming", "John Doe", true, 2020);
    Book book2 = new Book();
    Book book3 = new Book("Python Programming", "Jane Smith", true, 2018);

    book3.printDetails();

    System.out.println(library.addBook(book1));
    System.out.println(library.addBook(book2));
    System.out.println(library.addBook(book3));
    System.out.println(library.addBook(book1));

    Customer customer1 = new Customer(
      "",
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

    System.out.println(library.addCustomer(customer1));
    System.out.println(library.addCustomer(customer2));
    System.out.println(library.addCustomer(customer3));
    System.out.println(library.addCustomer(customer1));

    Librarian librarian1 = new Librarian(
      "Charlie",
      1,
      "Alice",
      "5251234569",
      "charlie@example.com"
    );
    Librarian librarian2 = new Librarian("", 2, "", "", "test@example.com");

    Librarian librarian3 = new Librarian(5);
    librarian1.printDetails();
    LibraryManager manager1 = new LibraryManager(
      "Dave",
      4234594,
      "101 Blvd",
      "555987654",
      "dave@example.com"
    );
    LibraryManager manager3 = new LibraryManager(
      "Dani",
      9236564,
      "104 Blvd",
      "4343987654",
      "dani@example.com"
    );
    LibraryManager manager4 = new LibraryManager(
      "Tomi",
      7235597,
      "107 Blvd",
      "5465587654",
      "tomi@example.com"
    );

    LibraryManager manager2 = new LibraryManager(5);

    library.getLibrarians().add(librarian1);
    library.getLibrarians().add(librarian2);
    library.getLibrarians().add(librarian3);

    library.getLibraryManagers().add(manager1);
    library.getLibraryManagers().add(manager2);
    library.getLibraryManagers().add(manager3);
    library.getLibraryManagers().add(manager4);

    library.findHighestlCustomersOrLibraryManager();

    // Create and register customers for new service
    ArrayList<CustomerNewService> customersNewService = new ArrayList<
      CustomerNewService
    >();

    CustomerNewService customerNewService1 = new CustomerNewService(1, 40.0);
    CustomerNewService customerNewService2 = new CustomerNewService(2, 120.0);
    CustomerNewService customerNewService3 = new CustomerNewService(3, 55.0);

    customersNewService.add(customerNewService1);
    customersNewService.add(customerNewService2);
    customersNewService.add(customerNewService3); // Will fail to register

    // Check initial subscription status of customers
    System.out.println("Initial Subscription Status:");
    for (int i = 0; i < customersNewService.size(); i++) {
      if (customersNewService.get(i).isSubscribed()) {
        System.out.println(
          "Customer with ID " +
          customersNewService.get(i).getId() +
          " is subscribed."
        );
      } else {
        System.out.println(
          "Customer with ID " +
          customersNewService.get(i).getId() +
          " is not subscribed."
        );
      }
    }
    System.out.println();

    // Check which customers is success Register to the service
    for (int i = 0; i < customersNewService.size(); i++) {
      if (customersNewService.get(i).registerForService(50.0)) {
        System.out.println(
          "Customer with ID " +
          customersNewService.get(i).getId() +
          " registered successfully."
        );
      } else {
        System.out.println(
          "Customer with ID " +
          customersNewService.get(i).getId() +
          " failed to register."
        );
      }
    }
    System.out.println();

    // Simulate borrowing and returning items
    BorrowAndReturn borrowReturn = new BorrowAndReturn(1); // Example item ID

    // Borrowing and returning items for each subscribed customer
    for (int i = 0; i < customersNewService.size(); i++) {
      if (customersNewService.get(i).isSubscribed()) {
        System.out.println(
          "Customer with ID " +
          customersNewService.get(i).getId() +
          " borrowing an item."
        );
        borrowReturn.borrowItem(customersNewService.get(i).getId(), 14); // Borrowing item for 14 days

        // Simulate late return with different days late
        int daysLate = 12; // Example value for days late (more than 10 days late)
        System.out.println(
          "Customer with ID " +
          customersNewService.get(i).getId() +
          " returning an item."
        );
        borrowReturn.returnItem(
          customersNewService.get(i).getId(),
          daysLate,
          customersNewService.get(i)
        ); // Returning item with days late

        // Check if customer is unsubscribed due to insufficient funds
        if (!customersNewService.get(i).isSubscribed()) {
          System.out.println(
            "Customer with ID " +
            customersNewService.get(i).getId() +
            " has been unsubscribed due to insufficient funds for fine."
          );
        }
      }
    }
    System.out.println();

    // Final subscription status of customers
    System.out.println("Final Subscription Status:");
    for (int i = 0; i < customersNewService.size(); i++) {
      if (customersNewService.get(i).isSubscribed()) {
        System.out.println(
          "Customer with ID " +
          customersNewService.get(i).getId() +
          " is subscribed."
        );
      } else {
        System.out.println(
          "Customer with ID " +
          customersNewService.get(i).getId() +
          " is not subscribed."
        );
      }
    }
  }
}
