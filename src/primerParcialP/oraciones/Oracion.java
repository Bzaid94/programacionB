package primerParcialP.oraciones;

import java.util.Scanner;

public class Oracion {
    public static void main(String[] args) {
        String oracion;
        int vocales = 0;
        int consonantes =0;
        int numeros = 0;
        char option = ' ';

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Ingrese una oración");
            oracion = scanner.nextLine();

            for (int x = 0; x < oracion.length(); x++) {
                char vocal = oracion.toLowerCase().charAt(x);
                if ((vocal == 'a') || (vocal == 'e') || (vocal == 'i') || (vocal == 'o') || (vocal == 'u')) {
                    vocales++;
                }
            }

            for (int record = 0; record < oracion.length(); record++) {
                char letras = oracion.toLowerCase().charAt(record);
                if (sumaConsonantes(letras)) {
                    consonantes++;
                }
            }

            for (int i = 0; i < oracion.length(); i++) {
                char nums = oracion.toLowerCase().charAt(i);
                if ((nums == '1') || (nums == '2') || (nums == '3') || (nums == '4') || (nums == '5') ||
                (nums == '6') || (nums == '7') || (nums == '8') || (nums == '9') || (nums == '0')) {
                    numeros++;
                }
            }

            System.out.println("Se encontraron: " + vocales + " vocales");
            System.out.println("Se encontraron: " + consonantes + " consonantes");
            System.out.println("Se encontraron: " + numeros + " numeros");

            System.out.println("\nSi desea agregar otra oracioón presione cualquier tecla o presione S para salir.");
            option = scanner.next().charAt(0);
        }while (option != 's' && option != 'S');
    }

    public static boolean sumaConsonantes(char letras){
        return "bcdfghjklmnñpqrstvwxyz".contains(String.valueOf(letras).toLowerCase());
    }
}