package com.bytebank.model;

public class GuardadorDeContas {
    private Conta[] referencias;
    private int posicaoLivre;

    public GuardadorDeContas() {
        this.referencias = new Conta[10];
    }

    public void adiciona(Conta conta) {
        this.referencias[this.posicaoLivre] = conta;
        this.posicaoLivre++;
    }

    public int getQuantidadeContas() {
        return this.posicaoLivre;
    }

    public Conta getReferencia(int posicaoRef) {
        return this.referencias[posicaoRef];
    }

}
