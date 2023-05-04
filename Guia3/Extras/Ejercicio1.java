package Guia3.Extras;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos");
        var min = consola.nextInt();

        var horas = min / 60;
        var dias = horas / 24;

        System.out.println("Esa cantidad de minutos corresponde a " + dias + " dias y " + (horas % 24) + " horas");
    }
}