public class Driver {
    public static void main(String[] args) {
 
       // instantiate objects for Author and Book and set values as same as output
       Author dummyAuthor = new Author("Robert T. Kiyosaki", "Robert@gmail.com", 'M');
       Book dummyBook = new Book("Rich Dad Poor Dad", dummyAuthor, 7.99, 150);
    
      // Call getters and print the book information
 
      System.out.println("Book Name: "+dummyBook.getName());
      System.out.println("Author Info: "+dummyBook.getAuthor());
      System.out.println("Price: $"+dummyBook.getPrice());
      System.out.println("Qunatity: "+dummyBook.getQuantity());
       
    }
 }
 
 