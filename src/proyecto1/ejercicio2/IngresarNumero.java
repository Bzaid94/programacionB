package proyecto1.ejercicio2;

import java.util.Scanner;

public class IngresarNumero {
    public static void main(String[] args) {
        int cantidad = 0;
        int i = 0;
        int numero = 0;
        int[] acumulador = new int[numero];

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese: ");
        cantidad = scanner.nextInt();

        while (i < cantidad){
            System.out.println("Ingrese numero: ");
            numero = scanner.nextInt();
            i++;
        }
        System.out.println(numero);
    }
}