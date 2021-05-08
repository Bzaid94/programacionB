package proyecto1.ejercicio10;

import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        int opcion = 0;
        char agregar = ' ';
        int cantidad;
        double importe = 0;
        double iva;
        double descuento = 0;
        double subtotal = 0;
        double total = 0;

        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Ingrese los datos del cliente");
            System.out.println("NIT del cliente: ");
            cliente.setNit(scanner.next());
            System.out.println("Nombre del cliente: ");
            cliente.setNombre(scanner.next());
            System.out.println("Dirección del cliente");
            cliente.setDireccion(scanner.next());

            do {
                System.out.println("Elija su tamaño de Pizza");
                System.out.println("1. Pizza Pequeña - Q35\n" + "2. Pizza Mediana - Q63.50\n" + "3. Pizza Grande  - Q95.30");
                opcion = scanner.nextInt();

                if (opcion == 1) {
                    System.out.println("Ingrese la cantidad de Pizzas");
                    cantidad = scanner.nextInt();
                    importe = cantidad * 35;
                } else if (opcion == 2) {
                    System.out.println("Ingrese la cantidad de Pizzas");
                    cantidad = scanner.nextInt();
                    importe = cantidad * 63.50;
                } else if (opcion == 3) {
                    System.out.println("Ingrese la cantidad de Pizzas");
                    cantidad = scanner.nextInt();
                    importe = cantidad * 95.30;
                } else {
                    System.out.println("Ingresó un valor inválido");
                }

                iva = importe * 0.12;
                subtotal = subtotal + importe + iva;

                System.out.println("Subtotal actual: " + subtotal);

                System.out.println("Presione S si desea agregar más pizzas a su orden");
                agregar = scanner.next().charAt(0);
            } while (agregar == 'S' || agregar == 's');

            System.out.println(subtotal);

            do {
                System.out.println("Elija el tamaño de su bebida");
                System.out.println("1. Bebida Pequeña - Q12.40\n" + "2. Bebida Grande - Q14.20\n");
                opcion = scanner.nextInt();

                if (opcion == 1) {
                    System.out.println("Ingrese la cantidad de Bebidas");
                    cantidad = scanner.nextInt();
                    importe = cantidad * 12.40;
                } else if (opcion == 2) {
                    System.out.println("Ingrese la cantidad de Bebidas");
                    cantidad = scanner.nextInt();
                    importe = cantidad * 14.20;
                } else {
                    System.out.println("Ingresó un valor inválido");
                }

                iva = importe * 0.12;
                subtotal = subtotal + importe + iva;

                System.out.println("Subtotal actual: " + subtotal);

                System.out.println("Presione S si desea agregar más bebidas a su orden");
                agregar = scanner.next().charAt(0);
            } while (agregar == 'S' || agregar == 's');

            System.out.println(subtotal);

            do {
                System.out.println("Elija un postre");
                System.out.println("1. Postre Manzana - Q15\n" + "2. Postre Queso - Q16.30\n");
                opcion = scanner.nextInt();

                if (opcion == 1) {
                    System.out.println("Ingrese la cantidad de postres");
                    cantidad = scanner.nextInt();
                    importe = cantidad * 15;
                } else if (opcion == 2) {
                    System.out.println("Ingrese la cantidad de postres");
                    cantidad = scanner.nextInt();
                    importe = cantidad * 16.30;
                } else {
                    System.out.println("Ingresó un valor inválido");
                }

                iva = importe * 0.12;
                subtotal = subtotal + importe + iva;

                System.out.println("Subtotal actual: " + subtotal);

                System.out.println("Presione S si desea agregar más postres a su orden");
                agregar = scanner.next().charAt(0);
            } while (agregar == 'S' || agregar == 's');

            total = subtotal;

            if (subtotal > 200) {
                descuento = subtotal * 0.05;
                total = subtotal - descuento;
            }

            System.out.println("Nit del cliente: " + cliente.getNit());
            System.out.println("Nombre del cliente: " + cliente.getNombre());
            System.out.println("Dirección del cliente: " + cliente.getDireccion());

            System.out.println("Subtotal a pagar: " + subtotal);
            System.out.println("Descuento: " + descuento);
            System.out.println("Total a pagar: " + total);

            System.out.println("Presione S si desea agregar otra compra");
            agregar = scanner.next().charAt(0);
        }while (agregar == 'S' || agregar == 's');
    }
}
