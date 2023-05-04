package Guia5.EjerciciosPracticosExtras;

public class Ejercicio5 {

    public static void main(String[] args) {
        int[][] matriz = new int[7][9];
        int suma = 0;
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 9; j++) {
                matriz[i][j] = (int) (Math.random() * 9 + 1);
            }
        }
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 9; j++) {
                suma += matriz[i][j];
            }
        }
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.print(suma + " ");
    }
}