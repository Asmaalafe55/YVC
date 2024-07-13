package homeTasks.task3;

import java.util.ArrayList;

public class Library {

  // List of all the books in the system
  private ArrayList<Book> books;
  // List of all the customers in the system
  private ArrayList<Customer> customers;
  // List of all the librarians in the system
  private ArrayList<Librarian> librarians;
  // List of all the library managers in the system
  private ArrayList<LibraryManager> libraryManagers;

  // Constructor to initialize the lists
  public Library() {
    this.books = new ArrayList<>();
    this.customers = new ArrayList<>();
    this.librarians = new ArrayList<>();
    this.libraryManagers = new ArrayList<>();
  }

  // Method to add a customer to the customers list
  public boolean addCustomer(Customer c) {
    // Check if a customer with the same ID already exists
    for (Customer customer : customers) {
      if (customer.getId() == c.getId()) {
        System.out.println("This customer is already registered.");
        return false;
      }
    }
    // If customer not found, add to list
    customers.add(c);
    return true;
  }

  // Method to add a book to the books list
  public boolean addBook(Book b) {
    // Check if a book with the same name already exists
    for (Book book : books) {
      if (book.getName().equals(b.getName())) {
        System.out.println("This book already exists.");
        return false;
      }
    }
    // If book not found, add to list
    books.add(b);
    return true;
  }

  // Method to compare number of customers and library managers
  public void findHighestlCustomersOrLibraryManager() {
    if (customers.size() > libraryManagers.size()) {
      System.out.println("Customers number are larger than library managers.");
    } else if (customers.size() < libraryManagers.size()) {
      System.out.println("Library managers are larger than customers number.");
    } else {
      System.out.println("They are equal.");
    }
  }

  // Getter for books list
  public ArrayList<Book> getBooks() {
    return books;
  }

  // Setter for books list
  public void setBooks(ArrayList<Book> books) {
    this.books = books;
  }

  // Getter for customers list
  public ArrayList<Customer> getCustomers() {
    return customers;
  }

  // Setter for customers list
  public void setCustomers(ArrayList<Customer> customers) {
    this.customers = customers;
  }

  // Getter for librarians list
  public ArrayList<Librarian> getLibrarians() {
    return librarians;
  }

  // Setter for librarians list
  public void setLibrarians(ArrayList<Librarian> librarians) {
    this.librarians = librarians;
  }

  // Getter for libraryManagers list
  public ArrayList<LibraryManager> getLibraryManagers() {
    return libraryManagers;
  }

  // Setter for libraryManagers list
  public void setLibraryManagers(ArrayList<LibraryManager> libraryManagers) {
    this.libraryManagers = libraryManagers;
  }

  // Override toString() method to provide formatted string representation of Library object
  @Override
  public String toString() {
    return (
      "Library:\n [\nbooks=" +
      books +
      ",\n customers=" +
      customers +
      ",\n librarians=" +
      librarians +
      ",\n libraryManagers=" +
      libraryManagers +
      "]"
    );
  }
}
