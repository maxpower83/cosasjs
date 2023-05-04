package Guia2;

import java.util.Scanner;

public class Ejercicio4 {

    static public void main(String args[]) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese cantidad de grados centigrados");
        double grados = consola.nextDouble();

        var far = 32 + (9 * grados / 5);

        System.out.println("La cantidad de grados pasados a Fahrenheit es: " + far);
    }
}