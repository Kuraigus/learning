package com.bytebank.teste;

import com.bytebank.model.Conta;
import com.bytebank.model.ContaCorrente;
import com.bytebank.model.ContaPoupanca;

public class TesteArrayReferencias {

    public static void main(String[] args) {
        Conta[] contas = new Conta[5];

        contas[0] = new ContaCorrente(22, 33);
        contas[1] = new ContaPoupanca(33, 22);

        System.out.println(contas[1].getNumero());
        System.out.println(contas[0].getNumero());
    }
}
