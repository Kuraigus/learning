package com.bytebank.model;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public String toString() {
        return "Conta poupanca\n" + super.toString();
    }
}