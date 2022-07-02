import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int d;
        int m;
        int a;
        long r;
        Scanner ler = new Scanner(System.in);
        d = ler.nextInt();
        m = ler.nextInt();
        a = ler.nextInt();
        r = ((long)a*365)+((long)m*30)+d;
        System.out.println(r);
    }
}