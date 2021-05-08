package proyecto1.ejercicio1;

import java.util.Scanner;

public class NumeroFactorial {
    public static void main(String[] args) {
        int nFactorial = 1;
        int numero;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número para obtener el valor factorial: ");
        numero = scanner.nextInt();

        if((numero == 1) || (numero == 0)) {
            System.out.println("El factorial es: 1");
        }else{
            for (int i = 2; i <= numero; i++) {
               nFactorial = nFactorial * i;
            }
            System.out.println("El valor factorial es: " + nFactorial);
        }
    }
}