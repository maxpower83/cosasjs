package Guia3.Extras;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        int a, b, c, d, aux;
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese los 4 valores");
        a = consola.nextInt();
        b = consola.nextInt();
        c = consola.nextInt();
        d = consola.nextInt();
        
        System.out.println("a: " + a + " b: " + b + " c: " + c + " d: " + d);
        
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        
        System.out.println("a: " + a + " b: " + b + " c: " + c + " d: " + d);
    }
}