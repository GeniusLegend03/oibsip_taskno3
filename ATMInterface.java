   
/*Default Login ID: Admin
Password: 1234*/
   
import java.util.Scanner;  //import required classes and packages   
      
  
public class ATMInterface    //create ATMExample class to implement the ATM functionality  
{  
        
    public static void main(String args[] ) //main method starts    
    {  
            
	int balance = 100000, withdraw, deposit;  //declare and initialize balance, withdraw, and deposit  
                   
    	Scanner sc = new Scanner(System.in); //create scanner class object to get choice of user 
		
	System.out.println("Please enter your credentials.");
	System.out.print("Enter Login ID:");
	String lid=sc.nextLine(); //get login ID from user using scanner object

	System.out.print("Enter Pin:");
	String pin=sc.nextLine(); //get password from user using scanner object

	if(lid.equals("Admin") && pin.equals("1234")) //compare Login ID and Password with Default Values.
	{
              
            while(true)  
            {  
                System.out.println("Welcome to ATM");  
                System.out.println("1. Withdraw");  
                System.out.println("2. Deposit");  
				System.out.println("3. Transfer"); 
                System.out.println("4. Check Balance");  
                System.out.println("5. QUIT");  
                System.out.print("Choose the operation you want to perform:");  
                  
                //get choice from user  
                int choice = sc.nextInt();  
                switch(choice)  
                {  
                case 1:  //Withdraw
					System.out.print("Enter money to be withdrawn:");  
                          
					//get the withdrawal money from user  
					withdraw = sc.nextInt();  
                          
					//check whether the balance is greater than or equal to the withdrawal amount  
					if(balance >= withdraw)  
					{  
					//remove the withdrawal amount from the total balance  
					balance = balance - withdraw;  
					System.out.println("Please collect your money");  
					}  
					else  
					{  
					//show custom error message   
					System.out.println("Insufficient Balance");  
					}  
					System.out.println("");  
				break;  
       
                case 2: //Deposit 
                          
					System.out.print("Enter money to be deposited:");  
                          
					//get deposit amount from the user  
					deposit = sc.nextInt();  
                          
					//add the deposit amount to the total balance  
					balance = balance + deposit;  
					System.out.println("Your Money has been successfully deposited");  
					System.out.println("");  
				break;  
				
		case 3: //Transfer
						System.out.print("Enter Receiver's Bank Account Number: ");
						int rac=sc.nextInt();
						System.out.print("Enter Amount to be transferred: ");
						int amttransfer=sc.nextInt();
						if(amttransfer<=balance)
						{
							System.out.println("Amount Successfully transferred.");
							balance=balance-amttransfer;
						}
						else
						{
							System.out.println("You don't have enough balance in your account.");
						}
						System.out.println(""); 
				break;
				
                case 4://Check Balance  
					//displaying the total balance of the user  
					System.out.println("Balance : "+balance);  
					System.out.println("");  
				break;  
       
                case 5:  //Quit
					//quit from the menu  
					System.exit(0);  
                }  
            }  
        }
	else //if login ID and password doesn't matches with Default Values.
	{
	System.out.println("Wrong Credentials");
	}
   	}  
}  