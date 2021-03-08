package primerParcialP.operaciones2;

public class Resta {
    int num1;
    int num2;
    int rest;

    public Resta() {
    }

    public Resta(int num1, int num2, int multi) {
        this.num1 = num1;
        this.num2 = num2;
        this.rest = multi;
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

    public int getMulti() {
        return rest;
    }

    public void setMulti(int multi) {
        this.rest = multi;
    }

    @Override
    public String toString() {
        return "Multiplicacion{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", multi=" + rest +
                '}';
    }
}
