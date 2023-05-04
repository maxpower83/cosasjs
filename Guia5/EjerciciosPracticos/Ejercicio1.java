package Guia5.EjerciciosPracticos;

public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Ingrese el tamaño del vector");
        int[] vector = new int[101];
        
        for (int i = 0; i < 100; i++) {
            vector[i] = i;
        }
        
        for (int i = 99; i >= 0; i--) {
            System.out.println(vector[i]);
        }
    }
}