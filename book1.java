import java.util.*;
class book
{
 String title;
 double prize;
 book()
 {
     title="java programming";
     prize=100.0;
 }
 void display()
 {
  System.out.println("Book title : "+title);
  System.out.println("Book prize : "+prize);
 }
}
public class book1
{
 public static void main(String args[])
 {
  book b=new book();
  b.display();
 }
}

 
