package org.example.Ejercicio5;
import java.util.Scanner;

public class EuclidesIterativa {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir un valor: ");
        int numero1 = scanner.nextInt();
        System.out.print("Introducir un valor: ");
        int numero2 = scanner.nextInt();
        scanner.close();
        int resultado = euclides(numero1, numero2);
        System.out.println("El máximo común divisor de " + numero1 + " y " + numero2 + " es " + resultado);
    }

    public static int euclides(int numero1, int numero2) {
        int resto = 0;
        while (numero2 != 0) {
            resto = numero1 % numero2;
            numero1 = numero2;
            numero2 = resto;
        }
        return numero1;
    }
}
