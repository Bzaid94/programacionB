package primerParcialTP.figurasGeometricas;

public class Rectangulo {
    double area;
    double base;
    double altura;
    double perimetro;

    public Rectangulo(double area, double base, double altura, double perimetro) {
        this.area = area;
        this.base = base;
        this.altura = altura;
        this.perimetro = perimetro;
    }

    public Rectangulo() {
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
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
        return "Rectangulo{" +
                "area=" + area +
                ", base=" + base +
                ", altura=" + altura +
                ", perimetro=" + perimetro +
                '}';
    }
}
