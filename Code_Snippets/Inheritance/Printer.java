import java.util.Date;
public class Printer
{
    public void PrintInfo(String book_name, String publisher, String author, Date published_date)
    {
        System.out.println("Book Information");
        System.out.println("Book Name: "+book_name);
        System.out.println("Publisher Name: "+publisher);
        System.out.println("Author Name: "+author);
        System.out.println("Published Date:"+published_date);
    }
}