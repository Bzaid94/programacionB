package proyecto1.ejercicio7;

public class Matriz {
    int filas;
    int columnas;
    double [] dimensiones = new double[2];

    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
    }

    public Matriz(double[] dimensiones) {
        this.dimensiones = dimensiones;
    }
}
