package com.CSE2027.day1;
import java.util.*;

public class ATM {
	
	abstract class atm {
		abstract void withdraw();
		abstract void deposite();
		abstract void check_balance();
		
		
	}
	
	class Customer extends atm{
		
		String name = "ARUNKUMAR";
		int phone_number=123454;
		int Account_number=28735836;
		String IFC_Code="RWD62BUD4";
		int current_balance=45779;

		
		void withdraw() {
			System.out.println("Enter withdraw amount:");
			Scanner input = new Scanner(System.in);
			int withdraw_amount = input.nextInt();
			if(withdraw_amount<=current_balance) {
				current_balance=current_balance-withdraw_amount;
				System.out.println(current_balance);
			}else {
				System.out.println("Insufficent Balance");
			}
			
		}

		
		void deposite() {
			System.out.println("Enter deposite amount:");
			Scanner input = new Scanner(System.in);
			int deposite_amount = input.nextInt();
			int result1=current_balance+deposite_amount;
			System.out.println(result1);
			
			
		}

		
		void check_balance() {
			System.out.println("Current_balance:"+current_balance);
		}
		
	}
	
	public static void main(String[] args) {
		 ATM atmObj = new ATM();
	        Customer c = atmObj.new Customer();

	        Scanner input = new Scanner(System.in);

	        System.out.println("===== ATM MENU =====");
	        System.out.println("1. Deposit");
	        System.out.println("2. Check Balance");
	        System.out.println("3. Withdraw");
	        System.out.print("Enter Your Choice: ");

	        int choice = input.nextInt();

	        switch (choice) {
	            case 1:
	                c.deposite();
	                break;

	            case 2:
	                c.check_balance();
	                break;

	            case 3:
	                c.withdraw();
	                break;

	            default:
	                System.out.println("Invalid Choice");
	        }
	        
	}

}
