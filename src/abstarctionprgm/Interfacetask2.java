package abstarctionprgm;
import java.util.Scanner;

interface Bank 
{
abstract public void account_details();
abstract public void balance();
abstract public void withdraw();
abstract public void deposit();
}

class SBI implements  Bank
{

String name;
int accno;
String bankname = "SBI";
double minbalance = 1000;
double amount;

Scanner sc = new Scanner(System.in);



public void account_details() 

    {System.out.print("Enter your name: ");
    name = sc.nextLine();

    System.out.print("Enter account number: ");
    accno = sc.nextInt();

    System.out.println("Bank Name: " + bankname);
    System.out.println("Name: " + name);
    System.out.println("Account Number: " + accno);
}

public void balance() 
{
    System.out.println("Balance: " + minbalance);
}

public void withdraw() 
{
    System.out.print("Enter amount to withdraw: ");
    amount = sc.nextDouble();

    if (amount <= minbalance) {
        minbalance = minbalance - amount;
        System.out.println("Amount withdrawn successfully.");
        System.out.println("Current Balance: " + minbalance);
    }
    else 
       {
        System.out.println("Insufficient balance.");
        }
}

public void deposit() 
{
    System.out.print("Enter amount to deposit: ");
    amount = sc.nextDouble();

    minbalance = minbalance + amount;

    System.out.println("Amount deposited successfully.");
    System.out.println("Current Balance: " + minbalance);
}
}

public class Interfacetask2 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	    SBI obj = new SBI();

	    int choice;

	    do {
	        System.out.println("\n--- BANK MENU ---");
	        System.out.println("1. Balance");
	        System.out.println("2. Withdraw");
	        System.out.println("3. Deposit");
	        System.out.println("4. Exit");

	        System.out.print("Enter your choice: ");
	        choice = sc.nextInt();

	        switch (choice) {

	        case 1:
	            obj.balance();
	            break;

	        case 2:
	            obj.withdraw();
	            break;

	        case 3:
	            obj.deposit();
	            break;

	        case 4:
	            System.out.println("Thank you!");
	            break;

	        default:
	            System.out.println("Invalid choice!");
	        }

	    } while (choice != 4);
	
	
	}
	}
