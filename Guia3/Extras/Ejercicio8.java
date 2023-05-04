package Guia3.Extras;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int num, par = 0, impar = 0, i = 0;
        
        do {
            System.out.println("Ingrese un numero");
            num = consola.nextInt(); 
            if (num > 0 && num % 2 == 0) {
                par = par + 1;
            } else if (num > 0 && num % 2 == 1){
                impar = impar + 1;
            }
            i = i + 1;
        } while (num % 5 != 0);
        System.out.println("La cantidad de numeros leidos es de: " + i);
        System.out.println("Se ingresaron " + par + " pares");
        System.out.println("Se ingresaron " + impar + " impares");
    }
}