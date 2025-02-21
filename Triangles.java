class RightAngleTriangle{
 public int n=5;
 public void right(){
  System.out.println("Right Angled Triangle is ");
  for(int i=0;i<=n;i++)
  {
   for(int j=1;j<=i;j++)
   {
    System.out.print("*");
   }
   System.out.println();
  }
 }
}
class LeftAngleTriangle{
 public int n=5;
 public void left(){
  System.out.println("Left Angled Triangle is");
  for(int i=0;i<=n;i++)
  {
   for(int j=i;j<=n;j++)
   {
    System.out.print(" ");
   }
   for(int j=1;j<=i;j++)
   {
    System.out.print("*");
   }
   System.out.println();
  }
  System.out.println();
 }
}
class Triangles{
 public static void main(String args[])
 {
  RightAngleTriangle y=new RightAngleTriangle();
  LeftAngleTriangle z=new LeftAngleTriangle();
  y.right();
  z.left();
 }
}