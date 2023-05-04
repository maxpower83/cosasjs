package Guia5.EjerciciosPracticosExtras;

public class Ejercicio2 {

    public static void main(String[] args) {
        var cont = 0;
        int[] vectorA = new int[10];
        int[] vectorB = new int[10];
        
        rellenar(vectorA);
        rellenar(vectorB);
        
        imprimir(vectorA);
        imprimir(vectorB);
        
        for (int i = 0; i < 10; i++) {
            if (vectorA[i] != vectorB[i]) {
                cont++;
                break;
            }
        }
        if (cont == 0) {
            System.out.println("Los vectores son iguales");
        } else System.out.println("Los vectores NO son iguales");
    }
    
    public static void rellenar(int[] array){
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 25 + 1);
        }
    }
    
    public static void imprimir(int[] array){
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}