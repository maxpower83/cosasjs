package Guia5.EjerciciosPracticos;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        var n = consola.nextInt();
        int[] vector = new int[n];
        int cont = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un valor al vector");
            vector[i] = consola.nextInt();
        }
        
        System.out.println("Ingresa el numero a buscar");
        var busca = consola.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (vector[i] == busca) {
                cont++;
                System.out.println("El numero se encuentra en la posicion " + (i+1));
            }
        }
        if (cont != 0) {
            System.out.println("El numero se encuentra " + cont + " veces");
        } else System.out.println("El numero no se encontro repetido");
    }
}