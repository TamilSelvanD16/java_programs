class Super{
 static void display()
 {
  System.out.println("In Super class");
 }
}
 class Sub extends Super{
  static void display()
  {
   System.out.println("In Sub class");
  }
 }
class Supersub
{
 public static void main(String args[])
 {
  Super obj=new Sub();
  obj.display();
 }
}