package proyecto1.ejercicio3;

import java.util.Scanner;

public class Estadio {
    public static void main(String[] args) {
        entradas();
    }

    private static void entradas() {
        int sector = 0;
        int tipoPago = 0;
        int cantEntradas;
        int importe;
        double recargo;
        double total = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el sector: ");
        System.out.println("1. Sol Candente     - Q35");
        System.out.println("2. Sol Luminoso     - Q55");
        System.out.println("3. Sombrita         - Q80");
        System.out.println("4. Tribunita        - Q150");
        System.out.println("5. Silla Plastica   - Q200");
        sector = scanner.nextInt();

        switch (sector){
            case 1:
                System.out.println("Ingrese la Cantidad de boletos que desea adquirir: ");
                cantEntradas = scanner.nextInt();
                System.out.println();

                System.out.println("Seleccione el tipo de pago: ");
                System.out.println("1. Efectivo\n" + "2. Tarjeta Débito/Crédito (5% de recargo)");
                tipoPago = scanner.nextInt();

                if(tipoPago == 1){
                    total = cantEntradas * 35;
                }else if(tipoPago == 2){
                    importe = cantEntradas * 35;
                    recargo = importe * 0.05;
                    total = importe + recargo;
                }
                System.out.println("El total a cancelar es: " + total);
                break;
            case 2:
                System.out.println("Ingrese la Cantidad de boletos que desea adquirir: ");
                cantEntradas = scanner.nextInt();
                System.out.println();

                System.out.println("Seleccione el tipo de pago: ");
                System.out.println("1. Efectivo\n" + "2. Tarjeta Débito/Crédito (5% de recargo)");
                tipoPago = scanner.nextInt();

                if(tipoPago == 1){
                    total = cantEntradas * 55;
                }else if(tipoPago == 2){
                    importe = cantEntradas * 55;
                    recargo = importe * 0.05;
                    total = importe + recargo;
                }
                System.out.println("El total a cancelar es: " + total);
                break;
            case 3:
                System.out.println("Ingrese la Cantidad de boletos que desea adquirir: ");
                cantEntradas = scanner.nextInt();
                System.out.println();

                System.out.println("Seleccione el tipo de pago: ");
                System.out.println("1. Efectivo\n" + "2. Tarjeta Débito/Crédito (5% de recargo)");
                tipoPago = scanner.nextInt();

                if(tipoPago == 1){
                    total = cantEntradas * 80;
                }else if(tipoPago == 2){
                    importe = cantEntradas * 80;
                    recargo = importe * 0.05;
                    total = importe + recargo;
                }
                System.out.println("El total a cancelar es: " + total);
                break;
            case 4:
                System.out.println("Ingrese la Cantidad de boletos que desea adquirir: ");
                cantEntradas = scanner.nextInt();
                System.out.println();

                System.out.println("Seleccione el tipo de pago: ");
                System.out.println("1. Efectivo\n" + "2. Tarjeta Débito/Crédito (5% de recargo)");
                tipoPago = scanner.nextInt();

                if(tipoPago == 1){
                    total = cantEntradas * 150;
                }else if(tipoPago == 2){
                    importe = cantEntradas * 150;
                    recargo = importe * 0.05;
                    total = importe + recargo;
                }
                System.out.println("El total a cancelar es: " + total);
                break;
            case 5:
                System.out.println("Ingrese la Cantidad de boletos que desea adquirir: ");
                cantEntradas = scanner.nextInt();
                System.out.println();

                System.out.println("Seleccione el tipo de pago: ");
                System.out.println("1. Efectivo\n" + "2. Tarjeta Débito/Crédito (5% de recargo)");
                tipoPago = scanner.nextInt();

                if(tipoPago == 1){
                    total = cantEntradas * 200;
                }else if(tipoPago == 2){
                    importe = cantEntradas * 200;
                    recargo = importe * 0.05;
                    total = importe + recargo;
                }
                System.out.println("El total a cancelar es: " + total);
                break;
            default:
                System.out.println("Debe elegir una opción válida");
                break;
        }
    }
}
