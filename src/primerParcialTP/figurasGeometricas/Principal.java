package primerParcialTP.figurasGeometricas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;

        System.out.println("Menu: Elija una de las operaciones que desea realizar");
        System.out.println("1: Cuadrado");
        System.out.println("2: Rectangulo");
        System.out.println("3: Triangulo");
        System.out.println("4: Rombo");

        opcion = scanner.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Eligió Cuadrado");
                manager.operarCuadrado();
                break;
            case 2:
                System.out.println("Eligió Rectangulo");
                manager.operarRectangulo();
                break;
            case 3:
                System.out.println("Eligió Triangulo");
                manager.operarTriangulo();
                break;
            case 4:
                System.out.println("Eligió Rombo");
                manager.operarRombo();
                break;
            default:
                System.out.println("Debe elegir un valor válido");
                break;
        }
    }
}
