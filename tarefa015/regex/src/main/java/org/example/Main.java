package org.example;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        System.out.println("Teste 1 - dados corretos");
        login.validateLogin("flavimar","Teste1@@#");

        System.out.println("Teste 2 - username e senha com tamanho incorreto");
        login.validateLogin("jhon","Teste1@");

        System.out.println("Teste 3 - senha com tamanho incorreto");
        login.validateLogin("jhonh","Teste1@00012sdS");

        System.out.println("Teste 4 - senha faltando letra maiúscula");
        login.validateLogin("flavimar","teste1@@#");

        System.out.println("Teste 5 - senha faltando número");
        login.validateLogin("flavimar","testea@@#");

        System.out.println("Teste 6 - senha faltando caractere especial");
        login.validateLogin("flavimar","teste100");
    }
}