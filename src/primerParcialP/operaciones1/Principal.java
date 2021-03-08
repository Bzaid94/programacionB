package primerParcialP.operaciones1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int option = 0;

        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido. Elija una de las opciones que desea realizar");
        System.out.println("Menu\n" +
                "\n1. Multiplicación" +
                "\n2. División" +
                "\n3. Salir");

        option = scanner.nextInt();
        switch (option){
            case 1:
                manager.operarMulti();
                break;
            case 2:
                manager.operarDiv();
                break;
            case 3:
                break;
            default:
                System.out.println("Debe elegir una opción válida");
                break;
        }
    }
}
