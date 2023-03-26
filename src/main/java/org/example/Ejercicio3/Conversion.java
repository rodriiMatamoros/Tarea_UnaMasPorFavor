package org.example.Ejercicio3;
import java.util.Scanner;

public class Conversion {

    public static Converter getConverter(int base) {
        return (number) -> {
            StringBuilder result = new StringBuilder();
            while (number > 0) {
                int rem = number % base;
                if (rem < 10) {
                    result.insert(0, rem);
                } else {
                    result.insert(0, (char) ('A' + rem - 10));
                }
                number = number / base;
            }
            return result.toString();
        };
    }

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número decimal: ");
        String input = scanner.nextLine();

        int decimal;
        try {
            decimal = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Error: entrada inválida.");
            return;
        }

        Converter hexConverter = getConverter(16);
        System.out.println(decimal + " en hexadecimal es: " + hexConverter.convert(decimal));
        Converter base5Converter = getConverter(5);
        System.out.println(decimal + " en base 5 es: " + base5Converter.convert(decimal));
    }
}

