import java.util.Date;

public class Book
{
    private String Name;
    private String Publisher;
    private String authorName;
    private Date publishDate;
    public Book(){}
    public void setName(String name)
    {
        this.Name = name;
    }
    public void setPublisher(String publisher)
    {
        this.Publisher = publisher;
    }
    public void setAuthorName(String author)
    {
        this.authorName = author;
    }
    public void setPublishedDate(Date date)
    {
        this.publishDate = date;
    }
    public String getName()
    {
        return this.Name;
    }
    public String getPublisher()
    {
        return this.Publisher;
    }
    public String getAuthorName()
    {
        return this.authorName;
    }
    public Date getPublishedDate()
    {
        return this.publishDate;
    }
}