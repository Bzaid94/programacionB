package programacionB;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 0;
        int suma = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        numero2 = scanner.nextInt();
        suma = numero1 + numero2;
        System.out.println("El suma de: " + numero1 + " + " +  numero2 + " es: " + suma);
    }
}
