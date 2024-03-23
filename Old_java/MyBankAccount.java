public class MyBankAccount
{  public MyBankAccount(double initialAmount)
   {  balance = initialAmount;
   }
   public MyBankAccount()
   {  balance = 0;
   }
   public double getBalance()
   {  return balance;
   }
   public void deposit(double amount)
   {  balance += amount;
   }
   public void withdraw(double amount)
   {  balance -= amount;
   }
   private double balance;
}
