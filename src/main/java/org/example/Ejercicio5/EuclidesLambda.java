package org.example.Ejercicio5;
import java.util.Scanner;
import java.util.function.BiFunction;

public class EuclidesLambda {

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir un valor: ");
        int numero1 = scanner.nextInt();
        System.out.print("Introducir un valor: ");
        int numero2 = scanner.nextInt();
        scanner.close();
        BiFunction<Integer, Integer, Integer> mcd = (a, b) -> {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        };
        int resultado = mcd.apply(numero1, numero2);
        System.out.println("El máximo común divisor de " + numero1 + " y " + numero2 + " es " + resultado);
    }
}