package Guia2;

import java.util.Scanner;

public class Ejercicio5 {

    static public void main(String args[]) {
        Scanner consola = new Scanner(System.in);

        int num, doble, triple;
        double raiz;

        System.out.println("Ingrese un numero");
        num = consola.nextInt();

        doble = num * 2;
        triple = num * 3;
        raiz = Math.sqrt(num);

        System.out.println("El doble es: " + doble);
        System.out.println("El triple es: " + triple);
        System.out.println("La raiz cuadrada es: " + raiz);
    }
}