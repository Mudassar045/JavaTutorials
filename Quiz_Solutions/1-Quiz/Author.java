public class Author {
    // The private instance variables
    private String name;
    private String email;
    private char gender;   // 'm' or 'f'
  
    // The constructor
    public Author(String name, String email, char gender) {
       this.name = name;
       this.email = email;
       this.gender = gender;
    }
  
    // The public getters for the private instance variables.

    public String getName() {
       return name;
    }
    public char getGender() {
       return gender;
    }
    public String getEmail() {
       return email;
    }
  
    // returning concatenated string
    public String toString() {
       return name + " (" + gender + ") at " + email;
    }
 }