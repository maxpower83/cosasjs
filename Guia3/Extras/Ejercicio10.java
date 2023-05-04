package Guia3.Extras;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int num1 = (int) (Math.random() * 10 + 1);
        int num2 = (int) (Math.random() * 10 + 1);
        int num3 = num1 * num2, numCons;

        do {
            System.out.println("Adivina el numero de la multiplicacion");
            numCons = consola.nextInt();
        } while (numCons != num3);
        System.out.println("CORRECTO, adivinaste el numero!");
    }
}