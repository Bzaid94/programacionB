package primerParcialTP.figurasGeometricas;

public class Tringulo {
    double base;
    double area;
    double altura;
    double perimetro;

    public Tringulo(double base, double area, double altura, double perimetro) {
        this.base = base;
        this.area = area;
        this.altura = altura;
        this.perimetro = perimetro;
    }

    public Tringulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Tringulo{" +
                "base=" + base +
                ", area=" + area +
                ", altura=" + altura +
                ", perimetro=" + perimetro +
                '}';
    }
}
