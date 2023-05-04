package Guia2;

import java.util.Scanner;

public class Ejercicio1 {
    static public void main(String args[]){
        int num1, num2, res;
        
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para sumar");
        num1 = consola.nextInt();
        System.out.println("Ingrese otro numero para sumar");
        num2 = consola.nextInt();
        
        res = num1 + num2;
        System.out.println("resultado = " + res);
    }
}
