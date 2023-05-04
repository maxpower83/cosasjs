package Guia5.EjerciciosPracticosExtras;

public class Ejercicio3 {

    public static void main(String[] args) {
        int[] vector = new int[9];
        
        rellenar(vector);
        imprimir(vector);
    }
    
    public static void rellenar(int [] array){
        for (int i = 0; i < 9; i++) {
            array[i] = (int) (Math.random() * 25 + 1);
        }
    }
    
    public static void imprimir(int [] array) {
        for (int i = 0; i < 9; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}