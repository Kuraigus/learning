package com.bytebank.teste;

import com.bytebank.model.Conta;
import com.bytebank.model.ContaCorrente;
import com.bytebank.model.GuardadorDeContas;
import com.bytebank.model.GuardadorDeReferencias;

public class TesteGuardadorReferencias {
    public static void main(String[] args) {
        GuardadorDeReferencias guardador = new GuardadorDeReferencias();

        ContaCorrente conta = new ContaCorrente(22, 33);

        guardador.adiciona(conta);

        System.out.println(guardador.getQuantidadeReferencias());

        Conta ref = (Conta) guardador.getReferencia(0);

        System.out.println(ref.getNumero());
    }
}
