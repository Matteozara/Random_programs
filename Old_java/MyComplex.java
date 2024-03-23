public class MyComplex
{

    // inizializza il numero complesso al valore 0 + i0 (zero complesso)
    public MyComplex()
    { realPart = 0;
      imagPart = 0;   
    }

    // inizializza il numero complesso al valore re + i*im
    public MyComplex(double realPart, double imagPart)
    { this.realPart = realPart;
      this.imagPart = imagPart;
    }

    //Somma a questo numero complesso il numero complesso z
    //somma di due complessi: z = z1+z2 = (x1+x2) + i(y1+y2)
    public MyComplex add(MyComplex z)
    {
     return new MyComplex(z.realPart + realPart, z.imagPart + imagPart);   
    }

    //Sottrae a questo numero complesso il numero complesso z
    //sottrazione di due complessi: z = z1-z2 = (x1-x2) +i(y1-y2)
    public MyComplex sub(MyComplex z)
    {
     return new MyComplex(realPart - z.realPart, imagPart - z.imagPart); 
    }

    //Moltiplica questo numero complesso per il numero complesso z
    //prodotto di due complessi: z = z1*z2 = (x1*x2 -y1*y2) + i*(x1*y2 + x2*y1)
    public MyComplex mult(MyComplex z)
    {
     return new MyComplex((realPart * z.realPart) - (imagPart * z.imagPart), (realPart * z.realPart) + (imagPart * z.imagPart));
    }

    //Divide questo numero complesso per il numero complesso z
    //divisione fra due complessi: z1/z2 = z1 *1/z2, per z2 != 0
    public MyComplex div(MyComplex z)
    {
     return mult(z.inv());
    }
          
    //Calcola il coniugato di questo numero complesso
    //coniugato del complesso z:  z^= x - i*y
    public MyComplex conj()
    { 
     return new MyComplex (realPart, (-1)*imagPart);
    }
          
    //Calcola l'inverso rispetto al prodotto di un numero complesso
    //inverso del complesso z: 1/z = x/(|z|*|z|) -i*y/(|z|*|z|), per z != 0
    public MyComplex inv()
    {
     return new MyComplex(realPart/(mod()*mod()), -imagPart/(mod()*mod()));
    }

    //Calcola il modulo di questo numero complesso
    //modulo del complesso z: |z| = sqrt( x*x + y*y).
    public double mod()
    {
     return Math.sqrt((realPart * realPart) + (imagPart * imagPart));
    }
           
    //Crea una stringa che rappresenta questo numero complesso
    //del tipo "x + i * y"
    public String toString()
    {
        return realPart + "  + i*" + imagPart;  //completare
    }

    //-------- metodi di accesso ----------
          
    //Restituisce la parte immaginaria di un numero complesso
    public double getIm()
    {
        return imagPart;
    }
    //Restituisce la parte reale di un numero complesso
    public double getRe()
    {
        return realPart;
    }

    //-------- variabili di esemplare
    
    private double realPart;
    private double imagPart;  
}
