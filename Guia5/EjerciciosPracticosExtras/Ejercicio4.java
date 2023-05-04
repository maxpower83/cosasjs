package Guia5.EjerciciosPracticosExtras;

public class Ejercicio4 {

    public static void main(String[] args) {
        int[][] matriz = new int[10][4];
        double[] notaFinal = new double[10];
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 10 + 1);
            }
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                switch (j) {
                    case 0 -> notaFinal[i] += (matriz[i][j] * 0.10);
                    case 1 -> notaFinal[i] += (matriz[i][j] * 0.15);
                    case 2 -> notaFinal[i] += (matriz[i][j] * 0.25);
                    case 3 -> notaFinal[i] += (matriz[i][j] * 0.5);
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(notaFinal[i] + " ");
        }
        System.out.println();
        
        imprimir(matriz);
        aprobados(notaFinal);
    }
    
    public static void imprimir(int[][] array){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void aprobados(double [] vector){
        int aprob = 0, desaprob = 0;
        for (int i = 0; i < 10; i++) {
            if (vector[i] > 7) {
                aprob++;
            } else desaprob++;
        }
        System.out.println("La cantidad de alumnos aprobados es: " + aprob + " y la cantidad de alumnos desaprobados es: " + desaprob);
    }
}