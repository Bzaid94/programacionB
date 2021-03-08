package primerParcialP.operaciones1;

public class Division {
    int num1;
    int num2;
    double div = 0;

    public Division(int num1, int num2, double div) {
        this.num1 = num1;
        this.num2 = num2;
        this.div = div;
    }

    public Division() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public double getDiv() {
        return div;
    }

    public void setDiv(double div) {
        this.div = div;
    }

    @Override
    public String toString() {
        return "Division{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", div=" + div +
                '}';
    }
}
