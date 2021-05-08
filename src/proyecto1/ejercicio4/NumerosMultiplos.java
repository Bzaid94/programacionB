package proyecto1.ejercicio4;

public class NumerosMultiplos {
    public static void main(String[] args) {
        int total = 0;

        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 ==0){
                System.out.println("Programacion I");
            }else if(i % 3 ==0){
                total += i;
                System.out.println("Progra");
            } else if(i % 5 == 0) {
                total += i;
                System.out.println("mación");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
