package Guia5.EjerciciosPracticosExtras;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        char[][] sopaDeLetras = new char[20][20];
        String[] palabra = new String[5];
        int[] vector = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese una palabra al vector");
            palabra[i] = consola.nextLine();
        }
        
        llenarSopa(sopaDeLetras);
        agregarPalabra(sopaDeLetras, palabra);
        imprimir(sopaDeLetras);
       
    }
    
    public static void llenarSopa(char [][] array){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                array[i][j] =(char) (Math.floor(Math.random()*(97-122+1)+122));
            }
        }
    }
    
    public static void imprimir(char [][] array){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void agregarPalabra(char[][] array, String[] palabra){
        int[] posicion = new int[5];
        for (int i = 0; i < 5; i++) {
            posicion[i] = (int) (Math.random() * 19);
            for (int j = 0; j < i; j++) {
                if (posicion[i] == posicion[j]) {
                    i--;
                }
            }
        }
        
        int cont = 0;
        for (int i = 0; i < 5; i++) {
            int num = posicion[i];
            String pal = palabra[i];
            for (int j = 0; j < 5; j++) {
                cont++;
            }
        }
    }
}