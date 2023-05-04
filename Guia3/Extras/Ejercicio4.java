package Guia3.Extras;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese un numero entre 1 y 10");
        var num = consola.nextInt();

        while (num < 1 || num > 10) {
            System.out.println("Ingres otro numero entre 1 y 10");
            num = consola.nextInt();
        }
        switch (num) { 
            case 1 -> System.out.println("El numero romano es: I");
            case 2 -> System.out.println("El numero romano es: II");
            case 3 -> System.out.println("El numero romano es: III");
            case 4 -> System.out.println("El numero romano es: IV");
            case 5 -> System.out.println("El numero romano es: V");
            case 6 -> System.out.println("El numero romano es: VI");
            case 7 -> System.out.println("El numero romano es: VII");
            case 8 -> System.out.println("El numero romano es: VIII");
            case 9 -> System.out.println("El numero romano es: IX");
            case 10 -> System.out.println("El numero romano es: X");
            default -> System.out.println("Opcion no encontrada!");
        }
    }
}