package programacionB;

import java.util.Scanner;

public class CalculoIva {
    public static void main(String[] args) {
        double precio, iva, importe, total, cantidad = 0;
        String nombreProducto;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto: ");
        nombreProducto = scanner.next();
        System.out.print("Ingrese el precio del producto: ");
        precio = scanner.nextDouble();
        System.out.print("Ingrese la cantidad de producto a comprar: ");
        //Convertira lo que el usuario ingrese a double, debido a que se capturó lo que ingresó por String
        cantidad = Double.parseDouble(scanner.next());

        importe = precio * cantidad;
        iva = importe * 0.12;
        total = importe + iva;
        System.out.println("importe: " + precio + "*" + cantidad);
        System.out.println("IVA: " + iva);
        System.out.printf("Total" + iva + importe + total);


    }

}
