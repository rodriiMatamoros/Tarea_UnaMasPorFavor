package org.example.Ejercicio4;

//Implemente de forma recursiva una función en java que nos diga si una cadena de caracteres es simétrica (un palíndromo)
// y preguntar por consola que frase quiere poner el usuario.

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