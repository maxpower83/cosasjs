package Guia3.Practicos;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int longi, inc = 0, corr = 0;
        String primeraL, ultimaL, codigo;

        do {
            System.out.println("Ingrese un codigo");
            codigo = consola.nextLine();
            longi = codigo.length();
            primeraL = codigo.substring(0, 1);
            ultimaL = codigo.substring(codigo.length() - 1, codigo.length());
            if (longi <= 5 && primeraL.equalsIgnoreCase("x") && ultimaL.equalsIgnoreCase("o")) {
                corr++;
            } else if (codigo.equalsIgnoreCase("&&&&&")) {
                System.out.println("Programa finalizado!");
            } else inc++;
        } while (!"&&&&&".equals(codigo));
        System.out.println("Cantidad de lecturas correctas: " + corr + ", cantidad de lecturas incorrectas: " + inc);
    }
}