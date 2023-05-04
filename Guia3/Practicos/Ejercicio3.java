package Guia3.Practicos;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa una frase o palabra de 8 caracteres");
        var frase = consola.nextLine();
        var longitud = frase.length();
        
        if (longitud <= 8){
            System.out.println("Frase CORRECTA");
        } else System.out.println("Frase INCORRECTA");
    }
}