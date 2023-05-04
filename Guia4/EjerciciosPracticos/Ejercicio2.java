package Guia4.EjerciciosPracticos;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        boolean op = true;
        do {
            Nombre();
            System.out.println("Desea ingresar otro nombre? \n S- SI \n N- NO");
            var opcion = consola.nextLine();
            
            switch (opcion) {
                case "S", "s":
                    op = true;                    
                    break;
                case "N", "n":
                    op = false;
                    break;
                default:
                    System.out.println("Opcion no encontrada");;
            }
        } while (op);
    }
    
    public static void Nombre(){
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        var nombre = consola.nextLine();
        System.out.println("Ingrese la edad");
        var edad = consola.nextInt();
        
        if (edad > 18) {
            System.out.println("El nombre es: " + nombre + ", la edad es: " + edad + " y es mayor de edad");            
        } else System.out.println("El nombre es: " + nombre + ", la edad es: " + edad + " y es menor de edad");
        
    }

}