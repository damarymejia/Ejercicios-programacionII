
   //Ejercicio 2.32
   /*Valores negativos, positivos y cero(()oEscriba un programa
   que reciba cinco números, y que determine e imprima la cantidad
   de números negativos, positivos, y la cantidad de ceros recibidos.*/

import java.util.Scanner;
   
public class ejercicio5
{  
    public static void main(String arg[])
        {  
            Scanner input = new Scanner(System.in);
            int numero1;
            int numero2;
            int numero3;
            int numero4;
            int numero5;
            
            System.out.println("Introduzca el primer numero:");
            numero1 = input.nextInt();
            
            System.out.println("Introduzca el segundo numero:");
            numero2 = input.nextInt();
            
            System.out.println("Introduzca el tercer numero:");
            numero3 = input.nextInt();
            
            System.out.println("Introduzca el cuarto numero:");
            numero4 = input.nextInt();
            
            System.out.println("Introduzca el quinto numero:");
            numero5 = input.nextInt();
            

            int positivos = 0;
            int negativos = 0;
            int ceros = 0;
            
            if ( numero1 > 0)
            positivos = positivos + 1;
            
            if ( numero1 < 0)
            negativos = negativos + 1;
            
            if ( 0 == numero1)
            ceros = ceros + 1;
            
            if ( numero2 > 0)
            positivos = positivos + 1;
            
            if ( numero2 < 0)
            negativos = negativos + 1;
            
            if ( 0 == numero2)
            ceros = ceros + 1;
            
            if ( numero3 > 0)
            positivos = positivos + 1;
            
            if ( numero3 < 0)
            negativos = negativos + 1;
            
            if ( 0 == numero3)
            ceros = ceros + 1;
            
            if ( numero4 > 0)
            positivos = positivos + 1;
            
            if ( numero4 < 0)
            negativos = negativos + 1;
            
            if ( 0 == numero4)
            ceros = ceros + 1;
            
            if ( numero5 > 0)
            positivos = positivos + 1;
            
            if ( numero5 < 0)
            negativos = negativos + 1;
            
            if ( 0 == numero5)
            ceros = ceros + 1;
            
            System.out.printf("\nCantidad de numeros positivos: %d \n", positivos);
            System.out.printf("\nCantidad de numeros negativos: %d \n", negativos);
            System.out.printf("\nCantidad de ceros: %d \n", ceros);
    } 
}  