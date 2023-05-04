package Guia3.Extras;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int i = 0;
        
        System.out.println("Ingrese el dividendo");
        var dividendo = consola.nextInt();
        
        System.out.println("Ingrese el divisor");
        var divisor = consola.nextInt();
        
        while (divisor < dividendo) {
            dividendo = dividendo - divisor;
            i = i + 1; 
        }
        System.out.println("Dado que " + dividendo + " es menor que " + divisor + ", entonces: el residuo es:  " + dividendo + " y el cociente es: " + i);
    }
}