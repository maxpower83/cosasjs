package Guia3.Practicos;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        var frase = consola.nextLine();
        
        if (frase.equalsIgnoreCase("eureka")) {
            System.out.println("Frase CORRECTA");
        } else System.out.println("Frase INCORRECTA");
    }
}