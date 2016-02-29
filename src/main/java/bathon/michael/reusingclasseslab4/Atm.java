package bathon.michael.reusingclasseslab4;

import java.util.Scanner;

/**
 * Created by michaelbathon on 2/7/16.
 */
public class Atm {

    public static void main(String[] args) {
        Atm mac = new Atm();
        mac.initialAccountSetup();
    }

    Scanner scan = new Scanner(System.in);

    void depositFunds(Account account, int depositedFunds){
        account.changeAccountBalance(depositedFunds);
    }

    private int checkBalance(Account account){
        return account.getAccountBalance();
    }

    void withdrawalFunds(Account account, int withdrawnFunds){
        account.changeAccountBalance(-withdrawnFunds);
    }

    private void initialAccountSetup(){

        System.out.println("Please enter your your name: ");

        String customerName = scan.nextLine();

        System.out.println("What kind of account would you like to open? ");

        String accountType = scan.nextLine();

        System.out.println("Enter an account number: ");

        String accountNumber = scan.nextLine();

        System.out.println("Please enter funds for your initial account balance: ");

        int startingBalance = scan.nextInt();

        Account customerAccount = createAccount(accountType, customerName, accountNumber, startingBalance);

        System.out.println();

        mainMenu(customerAccount);

    }

    private Account createAccount(String accountType, String customerName, String accountNumber, int startingBalance ){

        Account customerAccount = null;

        switch(accountType.toUpperCase()){

            case"CHECKING":
                customerAccount = new CheckingAccount(customerName, accountNumber, startingBalance);
                break;
            case"SAVINGS":
                customerAccount = new SavingsAccount(customerName,accountNumber, startingBalance);
                break;
            case"BUSINESS":
                customerAccount = new BusinessAccount(customerName, accountNumber, startingBalance);
                break;
            default:
                System.out.println("We don't have that kind of account please choose from Checking, Savings, or Business.");
                initialAccountSetup();
                break;
        }

        return customerAccount;
    }

    private void mainMenu(Account account){

        System.out.println("What would you like to do: \n 1.Deposit Funds. \n 2.Withdrawal Funds. \n 3.Check your Balance. \n Enter 0 to exit.\n");

        int userChoice = scan.nextInt();

        switch(userChoice){

            case 0:
                exitAtm();
                break;
            case 1:
                System.out.println("Enter the funds to deposit: ");
                int deposit = scan.nextInt();
                depositFunds(account, deposit);
                System.out.println();
                mainMenu(account);
                break;
            case 2:
                System.out.println("How much would you like to withdrawal: ");
                int withdrawal = scan.nextInt();
                withdrawalFunds(account, withdrawal);
                System.out.println();
                mainMenu(account);
                break;
            case 3:
                System.out.println("Your balance is: $" + checkBalance(account)+ " for account number: " + account.getAccountNum());
                System.out.println();
                mainMenu(account);
                break;
            default:
                System.out.println("That option isn't recognized, try again.");
                System.out.println();
                mainMenu(account);
                break;
        }
    }

    private void exitAtm(){
        System.out.println("Have a nice day, thanks for banking with Bathon National Bank!");
    }




}
