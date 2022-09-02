package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        List<Integer> valores = new ArrayList<>();
        int dado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite valores inteiros, digite 0 para finalizar");
        try {
            do{
                dado = sc.nextInt();
                valores.add(dado);
            }while(valores.get(valores.size()-1) != 0);
            int i = -1;
            for (int v : valores) {
                vetor[++i] = v;
            }
            mostarVetor(i,vetor);
        }catch (InputMismatchException e){
            System.out.println("O valor informado tem que ser um numero");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("A quantidade de valores informados excedem o tamanho do vetor");
        }
    }

    public static void mostarVetor(int n,int[] vetor){
        System.out.println("Os valores do array são:");
        for(int i = 0;i<=n;i++){
            System.out.println(vetor[i]);
        }
    }
}
