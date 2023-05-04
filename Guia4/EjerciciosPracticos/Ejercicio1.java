package Guia4.EjerciciosPracticos;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese un numeros");
        var num1 = consola.nextInt();
        var num2 = consola.nextInt();
        int opcion;

        do {
            System.out.println("Elija una opcion \n 1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir \n 5. Salir");
            opcion = consola.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + sumar(num1, num2));
                    break;
                case 2:
                    System.out.println("La resta es: " + restar(num1, num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion es: " + multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println("La division es: " + dividir(num1, num2));
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no encontrada");
                    ;
            }
        } while (opcion != 5);
    }

    public static int sumar(int num1, int num2) {
        var suma = 0;
        suma = num1 + num2;

        return suma;
    }

    public static int restar(int num1, int num2) {
        var resta = 0;
        resta = num1 - num2;

        return resta;
    }

    public static int multiplicar(int num1, int num2) {
        var multiplicar = 0;
        multiplicar = num1 * num2;

        return multiplicar;
    }

    public static int dividir(int num1, int num2) {
        var dividir = 0;
        dividir = num1 / num2;

        return dividir;
    }
}