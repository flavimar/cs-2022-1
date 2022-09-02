package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        setarNumeros();
    }

    private static void setarNumeros(){
        int num;
        int den;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite o numerador");
            num = sc.nextInt();
            System.out.println("Digite o denominador");
            den = sc.nextInt();
            System.out.println("A divisão dos numeros é " + dividir(num,den));
        }catch (ArithmeticException e){
            System.out.println("O denominador tem que ser diferente de zero");
        }catch (InputMismatchException e){
            System.out.println("O valor informado tem que ser um numero");
        }
    }
    private static double dividir(int num,int den){
        return num / den;
    }
}
