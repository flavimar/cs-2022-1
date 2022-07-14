package org.example;

import org.example.Exceptions.SaldoInsuficienteException;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.depositar(2);
        try {
            contaBancaria.sacar(1);
            contaBancaria.sacar(3);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
