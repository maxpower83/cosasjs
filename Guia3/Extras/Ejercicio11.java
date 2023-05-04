package Guia3.Extras;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = consola.nextInt();
        int i = 0;
        
        while (num > 0) {
            num = num / 10;
            i = i + 1;
        }
        System.out.println("El numero tiene " + i + " digitos");
    }
}