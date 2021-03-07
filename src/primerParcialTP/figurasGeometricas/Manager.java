package primerParcialTP.figurasGeometricas;

import java.util.Scanner;

public class Manager {
    Cuadrado cuadrado = new Cuadrado();
    Rectangulo rectangulo = new Rectangulo();
    Tringulo tringulo = new Tringulo();
    Rombo rombo = new Rombo();

    Scanner scanner = new Scanner(System.in);

    public void operarCuadrado(){
        System.out.println("Ingrese el lado del cuadrado: ");
        cuadrado.setLado(scanner.nextDouble());

        cuadrado.area = cuadrado.getLado() * cuadrado.getLado();
        System.out.println("El area del cuadrado es: " + cuadrado.area);

        return;
    }

    public void operarRectangulo(){
        System.out.println("Ingrese la base del rectangulo");
        rectangulo.setBase(scanner.nextDouble());
        System.out.println("Ingrese la altura del rectangulo");
        rectangulo.setAltura(scanner.nextDouble());

        rectangulo.area = rectangulo.getBase() * rectangulo.getAltura();

        System.out.println("El area del triangulo es: " + rectangulo.area);
        return;
    }

    public void operarTriangulo(){
        System.out.println("Ingrese la base del triangulo");
        tringulo.setBase(scanner.nextDouble());
        System.out.println("Ingrese la altura del triangulo");
        tringulo.setAltura(scanner.nextDouble());

        tringulo.area = tringulo.getBase() * tringulo.getAltura() / 2;

        System.out.println("El area del triangulo es: " + tringulo.area);
        return;
    }

    public void operarRombo(){
        System.out.println("Ingrese un lado del rombo");
        rombo.setLado(scanner.nextDouble());
        System.out.println("Ingrese el angulo del rombo");
        rombo.setAngulo(scanner.nextDouble());

        rombo.area = rombo.getAngulo() * rombo.getAngulo() * Math.sin(rombo.getAngulo());
        System.out.println("El area del rombo es: " + rombo.area);
        return;
    }
}
