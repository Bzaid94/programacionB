package primerParcialTP.notasEstudiantes;

public class Estudiante {
        String carneEstudiante;
        String nombre;
        String apellido;

    public Estudiante(String carneEstudiante, String nombre, String apellido) {
        this.carneEstudiante = carneEstudiante;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Estudiante() {
    }

    public String getCarneEstudiante() {
        return carneEstudiante;
    }

    public void setCarneEstudiante(String carneEstudiante) {
        this.carneEstudiante = carneEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "carneEstudiante='" + carneEstudiante + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
