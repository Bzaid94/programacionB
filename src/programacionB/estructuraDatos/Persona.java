package programacionB.estructuraDatos;

public class Persona {
    private String nombre;
    private String carne;

    public Persona() {
    }

    public Persona(String nombre, String carne) {
        this.nombre = nombre;
        this.carne = carne;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", carne='" + carne + '\'' +
                '}';
    }
}
