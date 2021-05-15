package programacionB.estructuraDatos.palindromo;

import java.util.Scanner;
import java.util.Stack;

public class Palindromo {
    public static void main(String[] args) {
        char opcion = ' ';
        String palabraOriginal;


        Scanner scanner = new Scanner(System.in);
        Stack<Character> pila = new Stack<>();

        do {
            System.out.println("Ingrese una palabra");
            palabraOriginal = scanner.next().toLowerCase();

            for (int i = 0; i < palabraOriginal.length(); i++) {
                pila.push(palabraOriginal.charAt(i));
            }

            String palabraReverso = "";

            while (!pila.isEmpty()){
                palabraReverso = palabraReverso + pila.pop();
            }

            System.out.println(palabraReverso);

            if(palabraOriginal.equals(palabraReverso)){
                System.out.println("Palindromo");
            }else {
                System.out.println("No Palindromo");
            }

            System.out.println("Desea agregar otra palabra?. Presione S para si o N para no.");
            opcion = scanner.next().charAt(0);
        }while (opcion == 'S' || opcion == 's');


    }
}
