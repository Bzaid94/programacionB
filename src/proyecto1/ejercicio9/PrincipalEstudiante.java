package proyecto1.ejercicio9;

import java.util.Scanner;

public class PrincipalEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        Notas notas = new Notas();
        char opcion = ' ';
        boolean bandera = false;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Ingrese el carné del alumno");
            estudiante.setCarneEstudiante(scanner.next());
            System.out.println("Ingrese el nombre del alumno");
            estudiante.setNombre(scanner.next());
            System.out.println("Ingrese el apellido del alumno");
            estudiante.setApellido(scanner.next());
            System.out.println("Ingrese la nota del primer parcial");

            do {
                notas.setPrimerParcial(scanner.nextDouble());

                if ((notas.getPrimerParcial() < 0) || (notas.getPrimerParcial() >10)) {
                    System.out.println("La nota del primer parcial se encuentra fuera de rango");
                    bandera = true;
                }else {
                    bandera = false;
                }
            }while (bandera);

            System.out.println("Ingrese la nota del segundo parcial");

            do {
                notas.setSegundoParcial(scanner.nextDouble());
                if ((notas.getSegundoParcial() < 0) || (notas.getSegundoParcial() > 20)) {
                    System.out.println("La nota del segundo parcial se encuentra fuera de rango");
                    bandera = true;
                }else{
                    bandera = false;
                }
            }while (bandera);

            notas.acumulado = notas.primerParcial + notas.segundoParcial;
            System.out.println("El alumno tiene una nota acumulada de: " + notas.acumulado);

            System.out.println("Ingrese la nota del examen final");

            do {
                notas.setExamenFinal(scanner.nextDouble());
                if ((notas.getSegundoParcial() < 0) || (notas.getSegundoParcial() > 50)) {
                    System.out.println("La nota del segundo parcial se encuentra fuera de rango");
                    bandera = true;
                }else {
                    bandera = false;
                }
            }while (bandera);

            notas.total = notas.acumulado + notas.examenFinal;
            if(notas.total >= 61){
                System.out.println("El alumno con carné: " + estudiante.carneEstudiante);
                System.out.println("Nombre: " + estudiante.nombre + " " + estudiante.apellido);
                System.out.println("Aprobó el curso con: " + notas.total + " puntos. Felicidades.");
            }else {
                System.out.println("El alumno con carné: " + estudiante.carneEstudiante);
                System.out.println("Nombre: " + estudiante.nombre + " " + estudiante.apellido);
                System.out.println("El alumno reprobó el curso con: " + notas.total + " puntos.");
            }

            if(notas.total <= 49){
                System.out.println("El estudiante tuvo un desempeño malo");
            }else if(notas.total >= 50 && notas.total <= 69) {
                System.out.println("El estudiante tuvo un desempeño regular");
            }else if(notas.total >= 70 && notas.total <= 89){
                System.out.println("El estudiante tuvo un desempeño bueno");
            }else if(notas.total >= 90){
                System.out.println("El estudiante tuvo un desempeño excelente");
            }

            System.out.println("Presione la tecla S si desea ingresar a otro alumno");
            opcion = scanner.next().charAt(0);
        }while(opcion == 'S' || opcion == 's');
    }
}
