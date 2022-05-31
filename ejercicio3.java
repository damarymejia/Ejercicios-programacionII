
//Enteros menor y mayor ejercicio 2.24

/* Escriba una aplicación que lea cinco enteros y que determine
e imprima los enteros mayor y menor en el grupo. Use solamente
las técnicas de programación que aprendió en este capítulo.*/



import java.util.Scanner;
  
public class ejercicio3
{           
    public static void main( String args[])
    {           
        Scanner inpunt = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;
        
        System.out.println("Ingrese el primer numero:");
        numero1 = inpunt.nextInt();
        
        System.out.println("\nIngrese el segundo numero:");
        numero2 = inpunt.nextInt();
        
        System.out.println("\nIngrese el tercer numero:");
        numero3 = inpunt.nextInt();
        
        System.out.println("\nIngrese el cuarto numero:");
        numero4 = inpunt.nextInt();
        
        System.out.println("\nIngrese el quinto numero:");
        numero5 = inpunt.nextInt();
        
        
        int menor = numero1;
        
        if ( numero2 < menor)
        menor = numero2;
        if ( numero3 < menor)
        menor = numero3;
        if (numero4 < menor)
        menor = numero4;
        if (numero5 < menor)
        menor = numero5;
        
        int mayor = numero1;
        
        if (numero2 > mayor)
        mayor = numero2;
        if (numero3 > mayor)
        mayor = numero3;
        if (numero4 > mayor)
        mayor = numero4;
        if(numero5 > mayor)
        mayor = numero5;
        
        System.out.printf("\nEl numero menor es: %d\n", menor);
        System.out.printf("\nEl numero mayor es: %d\n", mayor);
    }           
}   