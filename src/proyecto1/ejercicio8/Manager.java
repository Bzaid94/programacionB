package proyecto1.ejercicio8;

import java.util.Scanner;

public class Manager {
    Multiplicacion multiplicacion = new Multiplicacion();
    Division division =  new Division();

    Scanner scanner = new Scanner(System.in);

    public void operarMulti(){
        System.out.println("Eligió Multiplicación");
        System.out.println("Ingrese el primer número");
        multiplicacion.setNum1(scanner.nextInt());
        System.out.println("Ingrese el segundo número");
        multiplicacion.setNum2(scanner.nextInt());

        while(multiplicacion.num2 != 0){
            multiplicacion.multi = multiplicacion.multi + multiplicacion.num1;
            multiplicacion.num2 = multiplicacion.num2 -1;
        }
        System.out.println("La multiplicación de ambos números es: " + multiplicacion.multi);
        return;
    }

    public void operarDiv(){
        System.out.println("Eligió División");
        System.out.println("Ingrese el primer número");
        division.setNum1(scanner.nextInt());
        System.out.println("Ingrese el segundo número");
        division.setNum2(scanner.nextInt());

        if(division.getNum2() != 0){
            while (division.num1 >= division.num2){
                division.num1 = division.num1 - division.num2;
                division.div++;
            }
            System.out.println(division.div);
        }else {
            System.out.println("ERROR: No se puede dividir un número con valor: " + division.num2);
        }
        return;
    }
}
