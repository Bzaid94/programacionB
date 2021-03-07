package primerParcialTP.figurasGeometricas;

public class Rombo {
    double angulo;
    double lado;
    double area;
    double perimetro;

    public Rombo(double angulo, double lado, double area, double perimetro) {
        this.angulo = angulo;
        this.lado = lado;
        this.area = area;
        this.perimetro = perimetro;
    }

    public Rombo() {
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Rombo{" +
                "angulo=" + angulo +
                ", lado=" + lado +
                ", area=" + area +
                ", perimetro=" + perimetro +
                '}';
    }
}
