

//ejercicio2.16

import java.util.Scanner;
  
public class ejercicio2
{           
  
  public static void main( String args[] )
  {    
    Scanner input = new Scanner(System.in);
    
    int numero1;
    int numero2;
    
    System.out.println("\nIntroduzca un numero: ");
    numero1 = input.nextInt();
    
    System.out.println("\nIntroduzca un numero: ");
    numero2 = input.nextInt();
    
    if ( numero1 > numero2 )
    System.out.printf("\nEl numero %d es mayor que %d\n", numero1, numero2);
    
    if ( numero2 > numero1 )
    System.out.printf("\nEl numero %d es mayor que %d\n", numero2, numero1);
    
    if ( numero1 == numero2 )
    System.out.printf( "\nEl numero %d es igual al numero %d\n", numero1, numero2);
  }       
}   