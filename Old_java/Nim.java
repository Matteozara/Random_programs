import java.util.Scanner;
import java.util.Random;
public class Nim
{ public static void main(String[] args)
  { Scanner console = new Scanner(System.in);
   int t = 0;
   int c = 0;
   int v = 0;
   int biglie = (int) (10 + (1+100-10)*Math.random());
   int mossa = (int) (0 + (1+100-0)*Math.random());
   int gioco = (int) (0 + (1+100-0)*Math.random());
   
   if (gioco%2 != 0)
    { System.out.println("\nIl computer giochera in versione stupida");
      if (mossa%2 == 0)
       {for (int i = 0; biglie > 1; i++) 
         { do
          { System.out.println("Fai la tua mossa! Il numero di biglie generato e " +biglie+ ", quante ne sottrai? ");
            t = console.nextInt();
            if (t < biglie/2 && t >= 1)
             System.out.println("\nErrore, il numero digitato non e previsto dalle regole, ridigitare");
          }
         while(t < biglie/2 && t >= 1);
         
         biglie = biglie - t;
         if (biglie == 1)
          { a = 1;
            break;
          }
         c = (int) (1 + (1+biglie-1)*Math.random());
         biglie = biglie - c;
         System.out.println("\nIl computer ha scelto di rimuovere " +c+" biglie, quindi ne restano: " +biglie);
          if (biglie == 1)
          { a = 2;
            break;
          }
        }
      }
     else
        { for (int i = 0; biglie > 1; i++) 
          { c = (int) (1 + (1+biglie-1)*Math.random());
            biglie = biglie - c;
            if (biglie == 1)
          { a = 2;
            break;
          }
            System.out.println("\nIl computer ha scelto di rimuovere " +c+" biglie, quindi ne restano: " +biglie);
            do
             { System.out.println("Fai la tua mossa! Il numero di biglie generato e " +biglie+ ", quante ne sottrai? ");
               t = console.nextInt();
               if (t < biglie/2 && t >= 1)
               System.out.println("\nErrore, il numero digitato non e previsto dalle regole, ridigitare");
             }
            while(t < biglie/2 && t >= 1);
         
            biglie = biglie - t;
            if (biglie == 1)
          { a = 1;
            break;
          }
         }
     } 
    }

   else 
    { System.out.println("\nIl computer giochera in versione intelligente");
      if (mossa%2 == 0)
       { for (int i = 0; biglie > 1; i++) 
        { do
          { System.out.println("Fai la tua mossa! Il numero di biglie generato e " +biglie+ ", quante ne sottrai? ");
            t = console.nextInt();
            if (t < biglie/2 && t >= 1)
             System.out.println("\nErrore, il numero digitato non e previsto dalle regole, ridigitare");
          }
         while(t < biglie/2 && t >= 1);
         
         biglie = biglie - t;
         if (biglie == 1)
          { a = 1;
            break;
          }

          if (biglie/2 > 31)
           c = 31;
          else
           { if (biglie/2 > 15)
              c = 15;
             else 
              { if (biglie/2 > 7)
                 c = 7;
                else
                 { if (biglie/2 > 3)
                   c = 3; 
                  else
                   { if (biglie/2 > 1)
                      c = 1;
                   }
                 }
              }
            }
         biglie = biglie - c;
         System.out.println("\nIl computer ha scelto di rimuovere " +c+" biglie, quindi ne restano: " +biglie);
         if (biglie == 1)
          { a = 2;
            break;
          }
        }
      }
     else
        { for (int i = 0; biglie > 1; i++) 
          {if (biglie/2 > 31)
           c = 31;
           else
           { if (biglie/2 > 15)
              c = 15;
             else 
              { if (biglie/2 > 7)
                 c = 7;
                else
                 { if (biglie/2 > 3)
                   c = 3; 
                  else
                   { if (biglie/2 > 1)
                      c = 1;
                   }
                 }
              }
            }
            biglie = biglie - c;
            System.out.println("\nIl computer ha scelto di rimuovere " +c+" biglie, quindi ne restano: " +biglie);
            if (biglie == 1)
          { a = 2;
            break;
          }
            do
             { System.out.println("Fai la tua mossa! Il numero di biglie generato e " +biglie+ ", quante ne sottrai? ");
               t = console.nextInt();
               if (t < biglie/2 && t >= 1)
               System.out.println("\nErrore, il numero digitato non e previsto dalle regole, ridigitare");
             }
            while(t < biglie/2 && t >= 1);
         
            biglie = biglie - t;
            if (biglie == 1)
          { a = 1;
            break;
          }
          }
        }
     if (a == 1)
      System.out.println("\nGame over, hai perso!");
     if (a == 2)
      System.out.println("\nComplimenti, hai vinto!");
   }
}
