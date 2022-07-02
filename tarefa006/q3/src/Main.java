import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sal;
        Scanner ler = new Scanner(System.in);
        sal = ler.nextDouble();
        sal = sal + (sal * 0.15);
        System.out.println(sal);
    }
}