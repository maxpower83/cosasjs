package Guia5.EjerciciosPracticos;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int[][] matrizA = new int[3][3];
        
        System.out.println("Ingresa los datos a la matriz A");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizA[i][j] = consola.nextInt();
            }
        }
        
        imprimirMat(matrizA);
        System.out.println();

        validarMat(matrizA);

    }

    public static void imprimirMat(int[][] matriz) {
        for (int[] fila : matriz) {
            var aux = "";
            for (int elemento : fila) {
                aux += elemento + " ";
            }
            System.out.println(aux);
        }
    }
    
    public static void validarMat(int[][] matrizA){
        int valido = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizA[i][j] != -matrizA[j][i]) {
                    valido++;
                } 
            }
        }
        if (valido == 0) {
            System.out.println("La matriz es antisimétrica");
        } else System.out.println("La matriz NO es antisimétrica");
    }
}