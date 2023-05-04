package Guia3.Practicos;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        var frase = consola.nextLine();
        
        var primLetra = frase.substring(0, 1);
        System.out.println(primLetra);
        
        if (frase.substring(0, 1).equalsIgnoreCase("a")){
            System.out.println("Frase CORRECTA");
        } else System.out.println("Frase INCORRECTA");
    }
}