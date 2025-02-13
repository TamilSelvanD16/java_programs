public class mcq4
{
	public static void main(String[] args) {
	     int value=123456;
	     int count;
	     int evencount=0;
	     int oddcount=0;
	     while(value>0)
	     {
	         count=value%10;
	         value=value/10;
	         if(count%2!=0)
	         {
	             oddcount=oddcount+count;
	         }
	         else{
	             evencount=evencount+count;
	         }
	        
	     }
	      System.out.println("odd count is : " + oddcount); 
	      System.out.println("even count is : " + evencount);
	}
}
/*
odd count is : 9
even count is : 12
*/