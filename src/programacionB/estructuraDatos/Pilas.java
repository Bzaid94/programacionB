package programacionB.estructuraDatos;

import java.util.Stack;

public class Pilas {
    public static void main(String[] args) throws InterruptedException {
        Stack<Persona> pila = new Stack<Persona>();
        Persona persona;
        persona = new Persona();

        //En memoria nombre y carné
        persona.setNombre("Juan");
        persona.setCarne("7697");

        System.out.println("Ingresando primer persona..." + persona.toString());
        //insertar
        pila.push(persona);

        //Delay para mostrar el siguiente dato
        Thread.sleep(4000);
        System.out.println("Contenido: " + pila);

        persona = new Persona();
        //En memoria nombre y carné
        persona.setNombre("Pedro}");
        persona.setCarne("7690");

        System.out.println("Ingresando segunda persona..." + persona.toString());
        //insertar
        pila.push(persona);
        Thread.sleep(4000);
        System.out.println("Contenido: " + pila);


        persona = new Persona();
        //En memoria nombre y carné
        persona.setNombre("Sergio}");
        persona.setCarne("7691");

        System.out.println("Ingresando tercera persona..." + persona.toString());
        //insertar
        pila.push(persona);
        Thread.sleep(4000);
        System.out.println("Contenido: " + pila);


        //funcion que elimina las pilas hasta que quede vacio
        while (!pila.empty()){
            System.out.println("Sacando una persona... " + pila);
            System.out.println("Sacando... " + pila.peek().toString());
            Thread.sleep(4000);

            //borrar
            pila.pop();
        }

        System.out.println(pila);
    }
}
