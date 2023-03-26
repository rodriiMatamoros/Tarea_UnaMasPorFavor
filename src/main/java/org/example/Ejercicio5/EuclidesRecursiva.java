package org.example.Ejercicio5;
import java.util.Scanner;

public class EuclidesRecursiva {
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
        if (numero2 == 0) {
            return numero1;
        } else {
            return euclides(numero2, numero1 % numero2);
        }
    }
}