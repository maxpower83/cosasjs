package Guia3.Extras;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese la cantdad de numeros a analizar");
        var cantNum = consola.nextInt();
        var i = 0;
        int total = 0, max = 0, min = 999;
        
        do {
            System.out.println("Ingrese un numero");
            var num = consola.nextInt();
            
            total = total + num;
            
            if (num > max) {
                max = num;
            } else if (num < min){
                min = num;
            }
            
            i = i + 1;
            
        } while (i < cantNum);
        System.out.println("El valor maximo es: " + max);
        System.out.println("El valor minimo es: " + min);
        System.out.println("El promedio de todos los numeros es: " + (total / cantNum));
    }
}