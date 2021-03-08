package primerParcialP.operaciones2;

import java.util.Scanner;

public class Suma {
    int num1;
    int num2;
    int sum;

    public Suma() {
    }

    public Suma(int num1, int num2, int multi) {
        this.num1 = num1;
        this.num2 = num2;
        this.sum = multi;
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
        return sum;
    }

    public void setMulti(int multi) {
        this.sum = multi;
    }

    @Override
    public String toString() {
        return "Multiplicacion{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", multi=" + sum +
                '}';
    }
}
