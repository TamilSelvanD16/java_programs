public class reverse
{
	public static void main(String[] args) {
	     int value=123456;
	     int digit;
	     int even=0;
	     int odd=0;
	     int reversed=0;
	     int reversed_odd=0;
	     int reversed_even=0;
	     while(value>0)
	     {
	         digit=value%10;
	         value=value/10;
	         reversed=(reversed*10)+digit;
	         if(digit%2!=0)
	         {
	             odd=(odd*10)+digit;
	         }
	         else{
	             even=(even*10)+digit;
	         }
	        
	     }
	     System.out.println("reversed is : "+ reversed);
	     System.out.println("odd is : "+ odd);
	     System.out.println("even is : "+ even);
	     
	     while(odd>0)
	     {
	         int oddDigit;
	         oddDigit=odd%10;
	         odd=odd/10;
	         reversed_odd=(reversed_odd*10)+oddDigit;
	     }
	     while(even>0)
	     {
	         int evenDigit;
	         evenDigit=even%10;
	         even=even/10;
	         reversed_even=(reversed_even*10)+evenDigit;
	     }
	 
	      System.out.println("reversed_odd is : " + reversed_odd);
	      System.out.println("reversed_even is : " + reversed_even);
	      
	}
}
/*
reversed is : 654321
odd is : 531
even is : 642
reversed_odd is : 135
reversed_even is : 246
*/