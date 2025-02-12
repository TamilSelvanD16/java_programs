/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Arithmetic
{
	public static void main(String[] args) {
	    byte a=93;
	    byte b=45;
	    byte c;
	    c=(byte)(a+b);
	    System.out.println("Addition:" + c);
	     c=(byte)(a-b);
	    System.out.println("Subtraction:" + c);
	     c=(byte)(a*b);
	    System.out.println("Multiplication:" + c);
	     c=(byte)(a/b);
	    System.out.println("Quotient:" + c);
	     c=(byte)(a%b);
	    System.out.println("Remainder:" + c);
	}
}