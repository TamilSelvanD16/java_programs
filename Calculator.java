import java.util.*;
class calculator{
    Scanner s=new Scanner(System.in);
    public void add(){
        int a,b,c;
          System.out.print("enter the a value:");
          a=s.nextInt();
          System.out.print("enter the b value:");
          b=s.nextInt();
        c=a+b;
        System.out.println(" sum :" + c);
    }
    public int sub(){
        int d,e,f;
         System.out.print("enter the d value:");
          d=s.nextInt();
          System.out.print("enter the e value:");
          e=s.nextInt();
          f=d-e;
         return f;
        
    }
    public void mul(int g,int h){

        int i=g*h;
        System.out.println("product :" + i);
        
    }
    public double div(double x,double y){
        double z=x/y;
        return z;
    }
}
    class Calculator
    {
        public static  void main(String args[])
        {
      calculator s=new calculator();
            calculator p=new calculator();
             calculator m=new calculator();
                 calculator n =new calculator();
      s.add();
     System.out.println ("diff :" +p.sub());
     m.mul(25,7);
     
      System.out.println ("div :" +p.div(25,17));
     
        } 
    }
 /*
 enter the a value:25
enter the b value:17
 sum :42
enter the d value:25
enter the e value:17 
diff :8
product :175
div :1.4705882352941178
 */