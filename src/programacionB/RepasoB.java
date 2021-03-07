package programacionB;

import java.util.Scanner;

/*
    Solicitar un decimal entre 1 a 1000

 */
public class RepasoB {
    public static void main(String[] args) {
        String number;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número decimal entre 1 y 1000: ");
        number = Float.toString(scanner.nextFloat());

    }
}
