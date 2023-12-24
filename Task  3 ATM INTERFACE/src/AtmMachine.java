import java.util.Scanner;
public class AtmMachine 
{
	public static double balance=5000;
	

	public static void main(String[] args)
	{

		String AccountNumber,PinNumber;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to ATM:");
		System.out.println("Enter the Account Number:");
		AccountNumber=sc.nextLine();
		System.out.println("Enter the Pin Number:");
		PinNumber=sc.nextLine();
		if(authenticate(AccountNumber,PinNumber)) 
		{
			ShowMainu();
		}
		else
		{
			System.out.println("authentication failed.Exiting...");
		}
		sc.close();
	}
	 public static boolean authenticate(String accountNumber, String pin) {
	        
	        return accountNumber.equals("123456") && pin.equals("1234");
	    }
	public static void ShowMainu()
			{
				int choice;
				Scanner sc=new Scanner(System.in);
				do
				{
					System.out.println("\nMain Menu");
					System.out.println("1.Check Balance");
					System.out.println("2.Withdraw ammount:");
					System.out.println("3.Deposit ammount");
					System.out.println("4.Exit");
					System.out.println("5.Enter your choice:");
					
					choice=sc.nextInt();
					switch(choice)
					{
					case 1:
						checkBalance();
						break;
					case 2:
						withdrawAmount();
						break;
					case 3:
						DepositeAmount();
						break;
					case 4:
						System.out.println("Thank you !!");
						break;
					default:
						System.out.println("Invalid Choice. Please Try Again");
					}
					
				}while(choice!=4);
			}
	public static void checkBalance()
	{
			 
			
				System.out.println("Your current Balance :$"+balance);
		}
			public static void withdrawAmount()
			{
				double amount;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the amount to withdraw:$");
				amount=sc.nextDouble();
				if(amount>0 && amount<=balance )
				{
					balance -=amount;
					System.out.println("Withdrawl is Successful!! Remaining balance:$"+balance);
				}
				else
				{
					System.out.println("Invalid amount or Insufficient funds.");
				}
				sc.close();
			}
			public static void DepositeAmount()
			{
				double amount;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the amount to withdraw:$");
				amount=sc.nextDouble();
				if(amount>0 && amount<=balance )
				{
					balance +=amount;
					System.out.println("Deposite is Successful!! New balance:$"+balance);
				}
				else
				{
					System.out.println("Invalid amount ");
				}
				sc.close();
			
	}
		

}
