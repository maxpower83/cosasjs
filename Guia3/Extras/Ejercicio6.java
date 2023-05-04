package Guia3.Extras;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        double total = 0, promedioBajos = 0;
        int bajos = 0;

        System.out.println("Ingrese la cantidad de personas a estudiar");
        var personas = consola.nextInt();

        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese la altura de la persona " + (i+1));
            double altura = consola.nextDouble();
            total = total + altura;
            if (altura < 1.60) {
                bajos = bajos + 1;
                promedioBajos = promedioBajos + altura;
            }
        }
        var promedioTotal = total / personas;
        System.out.println("El promedio de alturas debajo de 1.60 es de: " + (promedioBajos / bajos));
        System.out.println("El promedio de alturas en total es de: " + (promedioTotal));
    }
}