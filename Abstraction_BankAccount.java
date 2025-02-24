import java.util.*;

abstract class BankAccount{
    private int accountNumber;
    private double balance;
    static double interestRate = 5, interest=0;
    
    public BankAccount(){
        Scanner input = new Scanner(System.in);
        this.accountNumber = input.nextInt();
        this.balance = input.nextDouble();
    }
    
    public double get_balance(){
        return balance;
    }
    
    public double get_interestRate(){
        return interestRate;
    }
    
    abstract double calculateInterest();
    
    void display(){
        System.out.println("\nAccount No: "+accountNumber+"\nBalance: "+balance+
        "\nInterest: "+interest);
    }
}

class SavingsAccount extends BankAccount{
    SavingsAccount(){
        super();
    }
    
    double calculateInterest(){
        interest = (double)((super.get_balance()*super.get_interestRate()*10)/100);
        return interest;
    }
}

class CurrentAccount extends BankAccount{
    CurrentAccount(){
        super();
    }
    
    double calculateInterest(){
        interest = (double)((super.get_balance()*super.get_interestRate()*5)/100);
        return interest;
    }
}

public class Abstraction_BankAccount
{
	public static void main(String[] args) {
	    
	    SavingsAccount s = new SavingsAccount();
	    s.calculateInterest();
	    s.display();
	    CurrentAccount c = new CurrentAccount();
	    c.calculateInterest();
	    c.display();
	}
}