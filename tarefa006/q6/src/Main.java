import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner ler = new Scanner(System.in);
        n = ler.nextInt();
        System.out.println("antecessor: "+(n-1)+"\nsucessor: "+(n+1));
    }
}