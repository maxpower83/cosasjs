package Guia4.EjerciciosPracticos;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad a convertir");
        int moneda = consola.nextInt();
        
        convertir(moneda);
        
    }
    
    public static void convertir(int moneda) {
        int dolar = moneda * 290;
        int euro = moneda * 225;
        var libras = moneda * 1.5;
        
        System.out.println("El cambio de divisas es:");
        System.out.println(" Ese monto en dolares es: " + dolar + "\n Ese monto en Euros es: " + euro + "\n Ese monto en libras es: " + libras);
    }
}