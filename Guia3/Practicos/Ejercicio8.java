package Guia3.Practicos;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num = consola.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i > 1 && i < num && j > 1 && j < num) {
                    System.out.print(" ");
                } else System.out.print("*");
            }
            System.out.println();
        }
    }
}