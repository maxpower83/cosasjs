package Guia5.EjerciciosPracticos;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0;
        System.out.println("Ingrese el tamaño del vector");
        int n = consola.nextInt();
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese digitos al vector");
            vector[i] = consola.nextInt();
        }
          
        for (int i = 0; i < n; i++) {
            switch (contarDigitos(vector[i])) {
                case 1 -> uno++;
                case 2 -> dos++;
                case 3 -> tres++;
                case 4 -> cuatro++;
                case 5 -> cinco++;
            }
        }
        System.out.println("Se encontraron " + uno + " de 1 digito, " + dos + " de 2 digitos, " + tres + " de 3 digitos, " + cuatro + " de 4 digitos y " + cinco + " de 5 digitos");
    }
    
    public static int contarDigitos(int num){
        int dig = 0;
        while (num > 0) {
            num = num / 10;
            dig++;
        }
        return dig;
    }
}
