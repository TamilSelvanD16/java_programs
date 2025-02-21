class Super
{
 private int a,b;
 public int get_a()
 {
  int a=25;
  return a;
 }
 public int get_b()
 {
  int b=17;
  return b;
 }
}
class Sub extends Super{
 public static void main(String args[])
 {
 int c;
 Super f=new Super();
 c=f.get_a()+f.get_b();
  System.out.println("Sum is " +c);
 
}
}