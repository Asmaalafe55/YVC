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

  public Library() {
    this.books = new ArrayList<Book>();
    this.customers = new ArrayList<Customer>();
    this.librarians = new ArrayList<Librarian>();
    this.libraryManagers = new ArrayList<LibraryManager>();
  }

  public boolean addCustomer(Customer c) {
    // looping through the customers array list and looking for the customer that have
    //  the same id as the id of the new customer
    for (Customer customer : customers) {
      if (customer.getId() == c.getId()) {
        System.out.println("This customer is allready registered");
        return false;
      }
    }
    // if we did not found the customer by its id
    // it means that we need to add it
    customers.add(c);
    return true;
  }

  public boolean addBook(Book b) {
    // looping through the books array list and looking for the book that have
    //  the same name as the name of the new book
    for (Book book : books) {
      if (book.getName().equals(b.getName())) {
        System.out.println("This book is allready existed");
        return false;
      }
    }
    // if we did not found the book by its name
    // it means that we need to add it
    books.add(b);
    return true;
  }

  public void findHighestlCustomersOrLibraryManager() {
    if (customers.size() > libraryManagers.size()) System.out.println(
      "Customers number are larger that library managers"
    );
    else if (customers.size() < libraryManagers.size()) System.out.println(
      "Library managers are larger that customers number"
    );
    else System.out.println("They are equal");
  }

  public ArrayList<Book> getBooks() {
    return books;
  }

  public void setBooks(ArrayList<Book> books) {
    this.books = books;
  }

  public ArrayList<Customer> getCustomers() {
    return customers;
  }

  public void setCustomers(ArrayList<Customer> customers) {
    this.customers = customers;
  }

  public ArrayList<Librarian> getLibrarians() {
    return librarians;
  }

  public void setLibrarians(ArrayList<Librarian> librarians) {
    this.librarians = librarians;
  }

  public ArrayList<LibraryManager> getLibraryManagers() {
    return libraryManagers;
  }

  public void setLibraryManagers(ArrayList<LibraryManager> libraryManagers) {
    this.libraryManagers = libraryManagers;
  }

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
