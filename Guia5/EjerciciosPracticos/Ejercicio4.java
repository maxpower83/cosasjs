package Guia5.EjerciciosPracticos;

public class Ejercicio4 {

    public static void main(String[] args) {
        int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j] = (int) (Math.random() * 9 + 1);
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB[j][i] = matrizA[i][j];
            }
        }
        
        for (int[] fila: matrizA) {
            var aux = "";
            for (int elemento: fila) {
                aux += elemento + " ";
            }
            System.out.println(aux);
        }
        System.out.println();                                                                         
        
        for (int[] fila: matrizB) {
            var aux = "";
            for (int elemento: fila) {
                aux += elemento + " ";
            }
            System.out.println(aux);
        }
    }
}
