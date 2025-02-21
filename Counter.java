class Counter1{
 static int count=0;
 void counter(){
  count++;
 }
}
public class Counter{
 public static void main(String args[])
 {
  for(int i=0;i<=3;i++)
  {
   Counter1 object=new Counter1();
   object.counter();
  
  
  System.out.println("Created object is " +object.count);
 }
}
}