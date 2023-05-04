package Guia3.Extras;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        var letra = consola.next();
        
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
            System.out.println("La letra ingresada es una vocal");
        }else System.out.println("La letra ingresada NO es una vocal");
    }
}