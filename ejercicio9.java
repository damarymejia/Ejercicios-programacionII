
//ejercicio 2.25

import java.util.Scanner;
public class ejercicio9
{       
    public static void main(String args[])
    { 

        int numero;
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nIntroduzca un numero.");
        numero = input.nextInt();
        
        if( 0 == numero % 2 )
        System.out.println("\nEl numero es par.");
        
        if ( 0 != numero % 2)
        System.out.println("\nEl numero es impar.");
            
    }       
} 