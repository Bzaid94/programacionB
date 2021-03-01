package programacionB;

import java.util.Scanner;

public class CalculoIva {
    public static void main(String[] args) {
        double precio = 0, iva, importe, total = 0, cantidad = 0;
        int productos;
        int i = 0;
        String nombreProducto = "";

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Ingrese la cantidad de productos que desea comprar");
            productos = scanner.nextInt();

            while(i < productos) {
                System.out.print("Ingrese el nombre del producto: ");
                nombreProducto = scanner.next();
                System.out.print("Ingrese el precio del producto: ");
                precio = scanner.nextDouble();
                System.out.print("Ingrese la cantidad de producto a comprar: ");
                //Convertira lo que el usuario ingrese a double, debido a que se capturó lo que ingresó por String
                cantidad = Double.parseDouble(scanner.next());

                importe = precio * cantidad;
                iva = importe * 0.12;
                total = total+importe+iva;
                i++;

            }
            System.out.println("El total a pagar es de: " + total);

        }catch (Exception error){
            System.out.println("Debe ingresar un dato válido ");
        }
    }

}
