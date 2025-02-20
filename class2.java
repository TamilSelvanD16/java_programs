import java.util.*;
public class class2
{
    String name;
    Scanner s=new Scanner(System.in);
   
        void output(){
            System.out.print("enter the number of elements:");
              int n=s.nextInt();
              s.nextLine();
                System.out.print("enter the name:");
           for(int i=0;i<n;i++)
             
           {
               name=s.nextLine();
                       
           }  System.out.print("enter the reg.no:");
           for(int i=0;i<n;i++)
           {
             int  regno=s.nextInt();
                       
           }
}
 


	public static void main(String[] args) {
	class2 a=new class2();
	a.output();
	}
}
/*
enter the number of elements:3
enter the name:Tamil
Senthil
Rocky 
enter the reg.no:178
159
146
*/