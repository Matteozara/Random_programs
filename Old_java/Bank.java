public class Bank
{ private MyBankAccount z;
  private static double tot = 0;
  private static int max = 0;
  private static double saldom = 0;

  public Bank()
  { z = null;
  }

  public void addAccount(MyBankAccount a)
  { z = a;  
  }

  
  public double getTotalBalance()
  { tot = tot + z.getBalance();
    return tot;
  }
  
  public int count(double atLeast)
  { if (z.getBalance() >= atLeast)
     max = max + 1;
    
    return max;
  }

  public double getMaximum()
  { if (saldom < z.getBalance())
     saldom = z.getBalance();
     
     return saldom;
  }
}
