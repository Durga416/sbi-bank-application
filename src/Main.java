import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name,password and intial balance");
        String name = sc.next();
        String password = sc.next();
        int balance = sc.nextInt();

      SBIAccount durgaAcc = new SBIAccount(name,balance,password);
        System.out.println("Your account has been created with account number: "+durgaAcc.getAccountNo());

        //get Balance
        System.out.println("Your account balance is: "+durgaAcc.getBalance());

        //deposit
        System.out.println(durgaAcc.depositMoney(500));
        System.out.println("New Balance is:" +durgaAcc.getBalance());

        //withdraw
        System.out.println("Enter amount to be withdrawn: ");
        int amount = sc.nextInt();
        System.out.println("Enter your password: ");
        String enteredPassword = sc.next();

        System.out.println(durgaAcc.withdraw(amount,enteredPassword));
        System.out.println("Your current Balance is "+durgaAcc.getBalance());

        //interest
        System.out.println("Interest for 4 years on current balance "+durgaAcc.getBalance()+" is "+durgaAcc.calculateInterest(4) );
    }
}