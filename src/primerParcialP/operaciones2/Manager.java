package primerParcialP.operaciones2;

import java.util.Scanner;

public class Manager{
    char continuar = ' ';
    int  option= 0;
    Suma suma = new Suma();
    Resta resta = new Resta();
    Multiplicacion multiplicacion = new Multiplicacion();
    Division division = new Division();

    Scanner scanner = new Scanner(System.in);

    public void operarSuma(){
        System.out.println("Elgió Suma");
        System.out.println("Ingrese el primer número");
        suma.setNum1(scanner.nextInt());
        System.out.println("Ingrese el segundo número");
        suma.setNum2(scanner.nextInt());

        suma.sum = suma.num1 + suma.num2;
        System.out.println("La suma de: "+ suma.getNum1() + " + " + suma.getNum2() + " es: " + suma.sum + "\n");

        System.out.println("Desea ingresar otra operación?\nIngrese cualquier tecla para continuar o S para salir");
        continuar = scanner.next().charAt(0);
        if(continuar != 's' && option != 'S'){
            menu();
        }else {
            System.exit(0);
        }
    }
    public void operarResta(){
        System.out.println("Elgió Resta");
        System.out.println("Ingrese el primer número");
        resta.setNum1(scanner.nextInt());
        System.out.println("Ingrese el segundo número");
        resta.setNum2(scanner.nextInt());

        resta.rest = resta.num1 - resta.num2;
        System.out.println("La Resta de: "+ resta.getNum1() + " + " + resta.getNum2() + " es: " + resta.rest + "\n");

        System.out.println("Desea ingresar otra operación?\nIngrese cualquier tecla para continuar o S para salir");
        continuar = scanner.next().charAt(0);
        if(continuar != 's' && option != 'S'){
            menu();
        }else {
            System.exit(0);
        }
    }
    public void operarMulti(){
        System.out.println("Elgió Multiplicación");
        System.out.println("Ingrese el primer número");
        multiplicacion.setNum1(scanner.nextInt());
        System.out.println("Ingrese el segundo número");
        multiplicacion.setNum2(scanner.nextInt());

        multiplicacion.multi = multiplicacion.num1 * multiplicacion.num2;
        System.out.println("La Multiplicaión de: "+ multiplicacion.getNum1() + " + " + multiplicacion.getNum2() + " es: " + multiplicacion.multi + "\n");

        System.out.println("Desea ingresar otra operación?\nIngrese cualquier tecla para continuar o S para salir");
        continuar = scanner.next().charAt(0);
        if(continuar != 's' && option != 'S'){
            menu();
        }else {
            System.exit(0);
        }
    }
    public void operarDiv(){
        System.out.println("Elgió Divisón");
        System.out.println("Ingrese el primer número");
        division.setNum1(scanner.nextInt());
        System.out.println("Ingrese el segundo número");
        division.setNum2(scanner.nextInt());

        if(division.num2 != 0){
            division.div = division.num1 / division.num2;
            System.out.println("La División de: "+ division.getNum1() + " + " + division.getNum2() + " es: " + division.div + "\n");
        }else{
            System.out.println("ERROR: No puede realizar la operación con valor: " + division.num1 + " / " + division.num2);
        }

        System.out.println("Desea ingresar otra operación?\n Ingrese cualquier tecla para continuar o S para salir");
        continuar = scanner.next().charAt(0);
        if(continuar != 's' && option != 'S'){
            menu();
        }else {
            System.exit(0);
        }
    }

    public void menu(){
        System.out.println("Bienvenido. Elija una de las opciones que desea realizar");
        System.out.println("Menu\n" +
                "\n1. Suma" +
                "\n2. Resta" +
                "\n3. Multiplicación" +
                "\n4. División" +
                "\n5. Salir");

        option = scanner.nextInt();
        switch (option){
            case 1:
                operarSuma();
                break;
            case 2:
                operarResta();
                break;
            case 3:
                operarMulti();
                break;
            case 4:
                operarDiv();
                break;
            case 5:
                break;
            default:
                System.out.println("Debe elegir una opción válida");
                break;
        }
    }
}
