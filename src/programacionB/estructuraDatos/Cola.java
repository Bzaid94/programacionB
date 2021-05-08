package programacionB.estructuraDatos;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {

    public static void main(String[] args) throws InterruptedException{
        //Instancia lista enlazada para el comportamiento de cola
        Queue<Persona> cola = new LinkedList<>();
        Persona persona;

        //primera persona
        persona = new Persona();
        persona.setNombre("Primero");
        persona.setCarne("7690-18");
        System.out.println("Ingresando la primer persona... " + persona.toString());
        cola.add(persona);
        Thread.sleep(4000);
        System.out.println("Contenido de la cola: " + cola);

        //segunda persona
        persona = new Persona();
        persona.setNombre("Segundo");
        persona.setCarne("7690-17");
        System.out.println("Ingresando la segunda persona... " + persona.toString());
        cola.add(persona);
        Thread.sleep(4000);
        System.out.println("Contenido de la cola: " + cola);

        //tercera persona
        persona = new Persona();
        persona.setNombre("Tercero");
        persona.setCarne("7690-16");
        System.out.println("Ingresando la tercera persona... " + persona.toString());
        cola.add(persona);
        Thread.sleep(4000);
        System.out.println("Contenido de la cola: " + cola);

        //tamaño de la cola
        int sizeCola = cola.size();

        while(!cola.isEmpty()){
            System.out.println("tamanio cola = " + sizeCola);
            System.out.println("atendiendo a una persona de la cola " + cola);

            //peek para mostrar lo que tiene la cola
            System.out.println("extrayendo... " + cola.peek().toString());
            Thread.sleep(4000);
            //atender
            cola.poll();
            sizeCola = cola.size();
        }
        System.out.println(cola);
    }
}
