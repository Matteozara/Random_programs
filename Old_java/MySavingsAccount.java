public class MySavingsAccount extends MyBankAccount
{  public MySavingsAccount(double rate)
   {  interestRate = rate;
   }
   public MySavingsAccount(double rate, double initialAmount)
   { super(initialAmount);
     interestRate = rate;
   }

   public void addInterest()
   {  deposit(getBalance() * interestRate / 100);
   }

   public void deposit(double amount)
   {  withdraw(1.5);
      super.deposit(amount);
   }
   private double interestRate;
}
