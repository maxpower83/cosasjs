package Guia3.Practicos;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa un valor maximo");
        var max = consola.nextInt();
        
        var resultado = 0;
        
        while (resultado < max) {
            System.out.println("Ingrese un numero para sumarlo");
            var num = consola.nextInt();
            resultado = resultado + num;
            System.out.println("El valor sumado es: " + resultado);
        }        
    }
}