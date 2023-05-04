package Guia2;

import java.util.Scanner;

public class Ejercicio3 {

    static public void main(String args[]) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingresa una frase");
        var frase = consola.nextLine();

        var fraseUp = frase.toUpperCase();
        System.out.println("Su frase en mayusculas es: " + fraseUp);

        var fraseDown = frase.toLowerCase();
        System.out.println("Su frase en minusculas es: " + fraseDown);
    }
}