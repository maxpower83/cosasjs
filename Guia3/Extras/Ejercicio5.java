package Guia3.Extras;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Ingrese la clase de socio que es");
        var socio = consola.nextLine();
        
        System.out.println("Ingrese el costo del tratamiento");
        var costo = consola.nextInt();
        
        switch (socio) {
            case "A", "a" -> System.out.println("El total a pagar es de: " + (costo * 0.5));
            case "B", "b" -> System.out.println("El total a pagar es de: " + (costo - costo * 0.35));
            case "C", "c" -> System.out.println("El total a pagar es de: " + (costo));
            default -> System.out.println("No se encontro esa clase de socio");
        }
    }
}