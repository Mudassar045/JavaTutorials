
public class Book {
    // The private instance variables
    private String name;
    private Author author;
    private double price;
    private int quantity;
  
    // Constructor
    public Book(String name, Author author, double price, int quantity) {
       this.name = name;
       this.author = author;
       this.price = price;
       this.quantity = quantity;
    }
  
    // Getters and Setters
    public String getName() {
       return name;
    }
    public Author getAuthor() {
       return author;  // return member author, which is an instance of the class Author
    }
    public double getPrice() {
       return price;
    }
    public void setPrice(double price) {
       this.price = price;
    }
    public int getQuantity() {
       return quantity;
    }
    public void setQuantity(int quantity) {
       this.quantity = quantity;
    }
 }