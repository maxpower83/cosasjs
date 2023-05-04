package Guia5.EjerciciosPracticosExtras;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int[] vector = new int[9];
        int suma = 0;
        
        for (int i = 0; i < 9; i++) {
        System.out.println("Ingrese un valor al vector");
        vector[i] = consola.nextInt();
        
        suma = suma + vector[i];
        }
        System.out.println("La suma de los valores es: " + suma);
    }
}
