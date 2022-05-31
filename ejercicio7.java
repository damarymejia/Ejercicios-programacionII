

//2.28 (Diámetro, circunferencia y área de un círculo)


import java.util.Scanner; 
public class ejercicio7

{ 
    public static void main(String arg[])
    {  
        Scanner input = new Scanner(System.in);
        int radio;

        System.out.println("\nPor favor introduzca el radio de un circulo:");
        radio = input.nextInt();

        System.out.printf("\nEl diametro del circulo es: %d", 2*radio);
        System.out.printf("\nEl perimetro del circulo es: %f", 2*Math.PI*radio);
        System.out.printf("\nEl area del circulo es: %f\n", Math.PI*radio*radio);
    }  
}   
