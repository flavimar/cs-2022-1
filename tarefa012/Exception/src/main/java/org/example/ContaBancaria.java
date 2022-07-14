package org.example;

import org.example.Exceptions.SaldoInsuficienteException;

public class ContaBancaria {
    private double saldo;
    public ContaBancaria(){
        saldo = 0;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
    public void sacar(double valor) throws SaldoInsuficienteException {
        if(valor > saldo){
            throw new SaldoInsuficienteException("Saldo insuficiente para a realizar o saque");
        }
        this.saldo -= valor;
    }
}
