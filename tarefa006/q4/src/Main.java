
import java.util.Scanner;

public class Main {
    public static class Peca{
        String cod;
        double valor;
        int quant;
    }
    public static void main(String[] args) {
        double ipi;
        double resp = 0;
        Scanner ler = new Scanner(System.in);

        ipi = ler.nextDouble();
        Peca peca = new Peca();
        for(int i = 0;i < 2;i++){
            peca.cod = ler.nextLine();
            ler.next();
            peca.valor = ler.nextDouble();
            peca.quant = ler.nextInt();
            resp = resp + (peca.valor * peca.quant);
        }
        resp = resp * ipi;
        System.out.println(resp);
    }
}