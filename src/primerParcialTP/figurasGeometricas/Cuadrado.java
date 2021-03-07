package primerParcialTP.figurasGeometricas;

public class Cuadrado {
    double lado;
    double perimetro;
    double area;

    public Cuadrado(double lado, double perimetro, double area) {
        this.lado = lado;
        this.perimetro = perimetro;
        this.area = area;
    }

    public Cuadrado() {
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                ", perimetro=" + perimetro +
                ", area=" + area +
                '}';
    }
}
