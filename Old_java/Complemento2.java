import java.util.Scanner;
public class Complemento2
{ public static void main(String[] args)
  { Scanner console = new Scanner(System.in);
    
    String s1 = 0b00;
    int n2 = 0b00;
    int n = 0;
    int z = 0;
    int v = 0;
    char a = ' ';
    char b = ' ';       
     
    do 
     { System.out.println("\nInseriren la prima frase: ");
       s1 = console.nextLine();
       if (s1.length() == 0)
        System.out.println("Errore, la stringa inserita e vuota!");     
     }
    while (s1.length() == 0);
    
    System.out.println("\nInserire la seconda frase: ");
    s2 = console.nextLine();
       
    if (s1.length() < s2.length())
     System.out.println("La seconda frase inserita non puo essere una sottostringa della prima perche e piu lunga");
    
    else 
     {if (s2.length() == 0)
       System.out.println("La seconda frase inserita essendo vuota, e una sottostringa di qualsiasi frase");
      else
       { for (int i = 0; i < s1.length();i++)
         { a = s1.charAt(i);
           b = s2.charAt(0);
           if (a == b)
            { v = 0;
              for (int m = 0; m < s2.length(); m++)
               { z = i + m;
                 a = s1.charAt(z);
                 b = s2.charAt(m);
                 if (a == b)
                  v = v + 1;
               }
            }
          }
       if (v == s2.length())
        System.out.println("\nLa seconda frase inserita e una sottostringa della prima");
       else 
        System.out.println("\nLa seconda frase inserita non e una sottostringa della prima");
      }
     }
   }
}



Scrivere il programma TwoComplementAdd che

    legga dall'input standard due numeri interi relativi rappresentati in complemento a due con tre bit; es. 000 (= 0), 010 (= 2), 101 (= -3)
    visualizzi sull'output standard il risultato dell'addizione dei due numeri, sempre rappresentato in complemento a due con tre bit
    nel caso in cui l'addizione abbia dato luogo a overflow, visualizzi nella riga seguente il messaggio Overflow

come illustrato nei seguenti esempi di esecuzione del programma

Inserire il primo numero: 010
Inserire il secondo numero: 101
010 + 101 = 111

Inserire il primo numero: 101
Inserire il secondo numero: 101
101 + 101 = 010
Overflow

Si noti come, per effetto della rappresentazione in complemento a due, non sia mai necessario esaminare esplicitamente il segno dei due numeri e/o del risultato.

IL PROGRAMMA NON DEVE UTILIZZARE CICLI.

Soluzione (TwoComplementAdd.java) [VISUALIZZA]
