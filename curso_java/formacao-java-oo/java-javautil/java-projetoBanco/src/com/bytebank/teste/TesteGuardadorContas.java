package com.bytebank.teste;

import com.bytebank.model.Conta;
import com.bytebank.model.ContaCorrente;
import com.bytebank.model.GuardadorDeContas;

public class TesteGuardadorContas {
    public static void main(String[] args) {
        GuardadorDeContas guardador = new GuardadorDeContas();

        ContaCorrente conta = new ContaCorrente(22, 33);

        guardador.adiciona(conta);

        System.out.println(guardador.getQuantidadeContas());

        Conta ref = guardador.getReferencia(0);

        System.out.println(ref.getNumero());
    }
}
