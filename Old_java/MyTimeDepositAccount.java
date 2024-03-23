public class MyTimeDepositAccount extends MySavingsAccount
{ private int n;
  private int anni;

  public MyTimeDepositAccount(int a, double rate)
  { super(rate);
    anni = a;
    n = 0;
  }
  
  public void MyTimeDepositAccount(int a, double rate, double tot)
  { super(rate,tot);
    anni = a;
    n = 0;
  }
  
  public void addInterest()
  { super.addInterest();
    n = n + 1;
  }
  
  public void withdraw(double v)
  { if(anni > n)
     super.withdraw(50);
     
    super.withdraw(v);
  }
}
