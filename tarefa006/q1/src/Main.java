import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int d,m,a;
        long r;
        Scanner ler = new Scanner(System.in);
        d = ler.nextInt();
        m = ler.nextInt();
        a = ler.nextInt();
        r = (a * 365) + (m * 30) + d;
        System.out.println(r);
    }
}