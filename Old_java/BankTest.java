public class BankTest
{ public static void main(String[] args)
  { Bank a = new Bank();
    Bank b = new Bank();
    MyBankAccount conto = new MyBankAccount(100);
    MyTimeDepositAccount c1 = new MyTimeDepositAccount(2,3);
    
    System.out.println(b.getTotalBalance());
    
    c1.deposit(100);
    c1.withdraw(20);
    
    c1.addInterest();
    
    System.out.println(c1.getBalance());
    
    a.addAccount(c1);
    b.addAccount(conto);
    
    System.out.println(b.getTotalBalance());
    
    System.out.println(b.getMaximum());
    
   }
}
