import java.util.Date;

import javax.print.attribute.standard.PrinterInfo;
public class Driver 
{
 public static void main(String args[])
 {
     Book obj = new Book();
     obj.setName("Rich Dad, Poor Dad");
     obj.setPublisher("The New York Times");
     obj.setAuthorName("Robert T. Kiyosaki");
     long millis=System.currentTimeMillis();  
     Date date=new java.util.Date(millis); 
     obj.setPublishedDate(date);
     PrinterInfo(obj.getName(),obj.getPublisher(),obj.getAuthorName(),obj.getPublishedDate());
 }
}