package Guia3.Extras;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera");
        var alt = consola.nextInt();
        
        for (int i = 0; i < alt; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}