package Guia5.EjerciciosPracticos;

import java.util.Scanner;

public class Ejercicio6 {
    
    static Scanner consola = new Scanner(System.in); 
    
    public static void main(String[] args) {
        int dimension;
        
        System.out.println("Ingrese el tamaño de la matriz, no debe superar el orden 10.");
        dimension = consola.nextInt();
        if (dimension<1 || dimension>10) { 
            do {
               System.out.println("Ingrese un tamaño válido");
               dimension = consola.nextInt();
              
            } while (dimension< 1 || dimension >10); 
        }

        int[][] array = new int[dimension][dimension];
        
        llenarArray(array, dimension);
        
        boolean verif = magic(array, dimension);
        
        mostrarArray(array,dimension);
        if (verif) {
            System.out.println("La matriz es un cuadrado mágico");
        }else{
            System.out.println("La matriz NO es un cuadrado mágico");
        }
    }
    
    public static void llenarArray(int[][] array, int dimension){
        int num;
        
        System.out.println("Rellene la matriz");
        
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                do {
                    System.out.print("[" + i + ", " + j + "] >> ");
                    num = consola.nextInt();
                } while (num<1 || num>dimension*dimension);
                array[i][j] = num;
            }
        }  
    }
    
    public static boolean magic(int[][] array, int dimension){
        
        int diagPrinc = 0, diagSec = 0, sumaFila, sumaCol;
        boolean magic;
        
        for (int i = 0; i < dimension; i++) {
            diagPrinc += array[i][i];
            diagSec += array[i][dimension-1-i];
        }
        
        magic = (diagPrinc == diagSec);
        
        if (magic) {
            for (int i = 0; i < dimension; i++) {
                sumaFila = 0;
                sumaCol = 0;
                for (int j = 0; j < dimension; j++) {
                    sumaFila += array[i][j];
                    sumaCol += array[j][i];
                }
           
                magic = (sumaFila == sumaCol) && (sumaFila == diagPrinc); 
            }
        }
        return magic;
    }
    
    public static void mostrarArray(int[][] array, int dimension){
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print("[" + array[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
