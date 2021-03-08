package primerParcialP.operaciones2;

public class Division {
    float num1;
    float num2;
    float div = 0f;

    public Division(float num1, float num2, float div) {
        this.num1 = num1;
        this.num2 = num2;
        this.div = div;
    }

    public Division() {
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float getDiv() {
        return div;
    }

    public void setDiv(float div) {
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
