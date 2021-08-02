package com.bytebank.teste.util;

import com.bytebank.model.Conta;
import com.bytebank.model.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        // <> = Generics especifica o tipo de objeto q vai conter na lista
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta conta1 = new ContaCorrente(22, 11);
        Conta conta2 = new ContaCorrente(22, 22);
        Conta conta3 = new ContaCorrente(22, 22);

        lista.add(conta1);
        lista.add(conta2);

        boolean existe = lista.contains(conta3);

        System.out.println(existe);

        for(Conta oRef: lista) {
            System.out.println(oRef);
        }
    }
}
