package Guia3.Practicos;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese un numeros");
        var num1 = consola.nextInt();

        System.out.println("Ingrese otro numero");
        var num2 = consola.nextInt();

        System.out.println("Elija la opcion que desea\n" + "1. Sumar\n" + "2. Restar\n" + "3. Multiplicar\n" + "4. Dividir \n" + "5. Salir\n" + "Elija una Opcion: ");
        var opcion = consola.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("La suma de ambos numeros es de: " + (num1 + num2));
                
                break;
            case 2:
                System.out.println("La resta de ambos numeros es de: " + (num1 - num2));
                
                break;
            case 3:
                System.out.println("La multiplicacion de ambos numeros es de: " + (num1 * num2));
                
                break;
            case 4:
                System.out.println("La division de ambos numeros es de: " + (num1 / num2));
                
                break;
            case 5:
                System.out.println("Saliendo");
                
                break;            
            default:
                System.out.println("Opcion no encontrada");
                
                break;
        }
    }
}