package org.example.Ejercicio4;
import java.util.Scanner;


public class esPalindromoIterativo {
    public static boolean esPalindromo(){
        String cadena;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        cadena = scanner.nextLine();
        scanner.close();
        int i = 0;
        int j = cadena.length() - 1;
        while (i < j) {
            if (cadena.charAt(i) != cadena.charAt(j)) {
                System.out.println("No es palindromo");
                return false;
            }
            i++;
            j--;
        }
        System.out.println("Es palindromo");
        return true;
    }
}




