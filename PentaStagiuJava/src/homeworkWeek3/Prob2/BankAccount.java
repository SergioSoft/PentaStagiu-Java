package homeworkWeek3.Prob2;

import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int userOption;
    boolean exit = false;
    float balance = 0f;
    	do {
          System.out.println("1. Deposit money");
          System.out.println("2. Withdraw money");
          System.out.println("3. Check balance");
          System.out.print("Welcome to your Bank - Account, 0 to quit: ");
          userOption = in.nextInt();
          switch (userOption) {
          case 1:
                float amount;
                System.out.print("Amount to deposit: ");
                amount = in.nextFloat();
                if (amount <= 0)
                     System.out.println("Can't deposit nonpositive amount.");
                else {
                     balance = balance +  amount;
                     System.out.println("RON" + amount + " has been deposited.");
                }
                break;
          case 2:
                System.out.print("Amount to withdraw: ");
                amount = in.nextFloat();
                if (amount <= 0 || amount > balance)
                     System.out.println("Operation is failled");
                else {
                     balance = balance + amount;
                     System.out.println("RON " + amount + " has been withdrawn.");
                }
                break;
          case 3:
                System.out.println("Your balance: RON " + balance);
                break;
          case 0:
                exit = true;
                break;
          default:
                System.out.println("Wrong option");
                break;
          }
         	System.out.println();
    	} while (!exit);
    		System.out.println("Good Day!");

	}

}

