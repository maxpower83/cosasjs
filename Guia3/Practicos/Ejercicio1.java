package Guia3.Practicos;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        var num = consola.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El nuemro es PAR");
        } else System.out.println("El numero es IMPAR");
    }
}