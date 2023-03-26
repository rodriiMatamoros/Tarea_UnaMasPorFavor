package org.example.Ejercicio4;
import java.util.Scanner;


public class esPalindromoRecursivo {
    public static boolean esPalindromo(String cadena, int i, int j) {
        if (i >= j) {
            return true;
        }
        if (cadena.charAt(i) != cadena.charAt(j)) {
            return false;
        }
        return esPalindromo(cadena, i + 1, j - 1);
    }

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String cadena = scanner.nextLine();
        scanner.close();
        if (esPalindromo(cadena, 0, cadena.length() - 1)) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
    }
}