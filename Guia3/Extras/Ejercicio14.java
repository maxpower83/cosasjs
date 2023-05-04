package Guia3.Extras;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
        var fam = consola.nextInt();
        int edadTotal = 0, promedio = 0, cantidadTotal = 0;

        for (int i = 0; i < fam; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia " + (i + 1));
            var hijos = consola.nextInt();
            cantidadTotal = cantidadTotal + hijos;
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese a edad del hijo " + (j + 1));
                var edad = consola.nextInt();
                edadTotal = edadTotal + edad;
            }
            promedio = edadTotal / cantidadTotal;
        }
        System.out.println("La edad promedio de todos los hijos es de: " + promedio + " años");
    }
}