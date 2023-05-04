package Guia4.EjerciciosPracticos;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese un numero para validar si es primo");
        int num = consola.nextInt();
        
        if (esPrimo(num)) {
            System.out.println("es primo");
        } else System.out.println("no es primo");

    }
    
    private static boolean esPrimo(int num) {
        boolean primo;
        int cont = 0;
        
        for (int i = 1; i < num+1; i++) {
            if (num % i == 0) {
                cont++;
            }
        }
        
        primo = cont == 2;
        
        return primo;
    }
}
