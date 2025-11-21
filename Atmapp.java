import java.util.Scanner;
interface Atm
{
    void withdraw(double amount);
    void deposit(double amount);
    void checkbalance();
}
class Account implements Atm
{
    double balance;
    Account(double b)
    {
        balance=b;
    }
    @Override
    public void withdraw(double amount)
    {
        if(amount<=balance)
        {
            balance=balance-amount;
            System.out.println("Withdraw ="+amount);
        }
        else
        {
            System.out.println("Insuficient Balance");
        }
    }
    @Override
    public void deposit(double amount)
    {
        System.out.println("Deposit"+amount);
        balance=balance+amount;
    }
    @Override
    public void checkbalance()
    {
        System.out.println("Current Blanace ="+balance);
    }

}
public class Atmapp
{
    public static void main(String[] args)
    {
      Scanner scn=new Scanner(System.in);
      Atm acc=new Account(5000);
      while(true)
      {
      System.out.println("ATM INTERFACE");
      System.out.println("1.Check balance\n2.Withdraw\n3.Deposit\n4.Exit");
      System.out.println("Enter your choice");    
      int choice=scn.nextInt();
      switch(choice)
      {
        case 1: 
                acc.checkbalance();
                break;
        case 2: System.out.println("Enter amount");
                double w=scn.nextDouble();
                acc.withdraw(w);
                break;
        case 3: System.out.println("Enter amount");
                double d=scn.nextDouble();
                acc.deposit(d);
                break;
        case 4:System.out.println("Thank you for Using Atm");
                return;
        default:System.out.println("Invalid choice");
      }
      }
    }
}
