package com.bytebank.model;

public class GuardadorDeReferencias {
    private Object[] referencias;
    private int posicaoLivre;

    public GuardadorDeReferencias() {
        this.referencias = new Object[10];
    }

    public void adiciona(Object ref) {
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }

    public int getQuantidadeReferencias() {
        return this.posicaoLivre;
    }

    public Object getReferencia(int posicaoRef) {
        return this.referencias[posicaoRef];
    }

}
