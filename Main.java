import java.util.*;
class Car{
    String brand="unknown";
    Car(){
        System.out.println("Intial Brand Name :"+brand);
    }
    void SetBrand(String S)
    {
        brand=S;
        System.out.println("User Brand :"+brand);
    }
}

public class Main
{
	public static void main(String[] args) {
	    
	    Car c=new Car();
	    Scanner scan =new Scanner(System.in);
	    System.out.print("Enter the Brand Name :");
	    String b=scan.nextLine(); 
	    c.SetBrand(b);
    
	}
}
/*
Intial Brand Name :unknown
Enter the Brand Name :volvo
User Brand :volvo
*/