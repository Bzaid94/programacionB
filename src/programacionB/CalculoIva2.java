package programacionB;

import java.util.Scanner;

public class CalculoIva2 {
    public static void main(String[] args) {
        double precio, iva, importe, total = 0, cantidad = 0;
        String choise;
        String nombreProducto;

        Scanner scanner = new Scanner(System.in);

        try{

            do {
                System.out.print("Ingrese el nombre del producto: ");
                nombreProducto = scanner.next();
                System.out.print("Ingrese el precio del producto: ");
                precio = scanner.nextDouble();
                System.out.print("Ingrese la cantidad de producto a comprar: ");
                //Convertira lo que el usuario ingrese a double, debido a que se capturó lo que ingresó por String

                cantidad = Double.parseDouble(scanner.next());
                importe = precio * cantidad;
                iva = importe * 0.12;
                total = total +importe + iva;

                System.out.println("Presione S para agregar más productos o N para terminar");
                choise = scanner.next();

            }while (choise.equals("S") | choise.equals("s"));

            System.out.println("El total a pagar es de: " + total);

        }catch (Exception error){
            System.out.println("Ingresó un dato incorrecto.");
        }
    }
}