import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sal,min = 1045.00;
        int resp;
        Scanner ler = new Scanner(System.in);
        sal = ler.nextDouble();
        resp = (int) (sal / min);
        System.out.println(resp);
    }
}