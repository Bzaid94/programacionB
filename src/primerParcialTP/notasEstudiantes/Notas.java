package primerParcialTP.notasEstudiantes;

public class Notas {
    double primerParcial;
    double segundoParcial;
    double acumulado;
    double examenFinal;
    double total;

    public Notas(double primerParcial, double segundoParcial, double acumulado, double examenFinal, double total) {
        this.primerParcial = primerParcial;
        this.segundoParcial = segundoParcial;
        this.acumulado = acumulado;
        this.examenFinal = examenFinal;
        this.total = total;
    }

    public Notas() {
    }

    public double getPrimerParcial() {
        return primerParcial;
    }

    public void setPrimerParcial(double primerParcial) {
        this.primerParcial = primerParcial;
    }

    public double getSegundoParcial() {
        return segundoParcial;
    }

    public void setSegundoParcial(double segundoParcial) {
        this.segundoParcial = segundoParcial;
    }

    public double getAcumulado() {
        return acumulado;
    }

    public void setAcumulado(double acumulado) {
        this.acumulado = acumulado;
    }

    public double getExamenFinal() {
        return examenFinal;
    }

    public void setExamenFinal(double examenFinal) {
        this.examenFinal = examenFinal;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Notas{" +
                "primerParcial=" + primerParcial +
                ", segundoParcial=" + segundoParcial +
                ", acumulado=" + acumulado +
                ", examenFinal=" + examenFinal +
                ", total=" + total +
                '}';
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
