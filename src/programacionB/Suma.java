package programacionB;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextInt();
        sum = num1 + num2;
        System.out.println("El suma de: " + num1 + " + " +  num2 + " es: " + sum);
    }
}
