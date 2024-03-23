public class MyStringVector
{ public MyStringVector()
   { c = new String[5];
     p = 0;
     b = false;
     m = 0;
     z = "";
     y = "";
     rem = "";
     risultato = "";
   }
   
   public void add(String s)
   { if (c.length >= p)
      c = java.util.Arrays.copyOf(c,c.length*2);
      
     if(s != null && s != "")
      { c[p] = s;
        p++;
      }
   }

   public void add(int index, String s)
   { if (c.length <= p+1)
      c = java.util.Arrays.copyOf(c,c.length*2);
     
     if (index >= 0 && index < p && s != null && s != "")
      for(int i = 0; i < p; i++)
       { if (p-i > index)
         c[p+1-i] = c[p-i];
         if (p-i == index)
          c[index+1] = c[index];
          c[index] = s;
          break;
       }
     p++;
   }

   public int capacity()
   { return c.length;
   }

   public boolean contains(String s)
   { b = false;
     for (int i = 0; i < p; i++)
      { if(c[i].equals(s))
         { b = true;
           break;
         }
      }
    return b;
   }
  
   public String elementAt(int index)
   { if (index >= 0 && index < p)
      return c[index];
     else
      return null; 
   }

   public int indexOf(String s)
   { m = -1;
     for (int i = 0; i < p; i++)
      { if (c[i].equals(s))
         { m = i;
           break;
         }
      }
    return m;
   }
   
   public boolean isEmpty()
   { if (p == 0)
      return true;
     else
      return false; 
   }

   public String max()
   { z = "";
     for (int i = 0; i < p; i++)
      { if(c[i].compareTo(z) > 0)
        z = c[i];
      }
     return z;
   }

   public String min()
   { y = c[0]
     for (int i = 0; i < p-1; i++)
      { if(y.compareTo(c[i]) > 0)
         y = c[i];
      }
     return y;
   }

   public void makeEmpty()
   { p == 0;
   }

   public String remove(int index)
   { if (index >= 0 && index < p)
      { rem = c[index];
        for (int i = index; i < p; i++)
         { c[i] = c[i+1];
         }
      p--;
      return rem;
      }
     else
      return null;
   }

   public String set(int index, String s)
   { if (index >= 0 && index < p)
      c[index] = s;
     else
      return null;
   }

   public int size()
   { return p;
   }

   public String[] toArray()
   { String[] a = new String[p];
     for (int i = 0; i < p; i++)
      { a[i] = c[i];
      }
     return a;
   }
   
   public String toString()
   { risultato = "";
     for (int i = 0; i < p; i++)
      { risultato = risultato + c[i];
        risultato = risultato + "\n";
      }
     return risultato;
   }
 private int p;
 private int m;
 private boolean b;
 private String[] c;
 private String rem;
 private String risultato;
 private String z;
 private String y;
}
