package com.bytebank.teste.util;

import com.bytebank.model.ContaCorrente;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        // <> = Generics especifica o tipo de objeto q vai conter na lista
        ArrayList<ContaCorrente> lista = new ArrayList<ContaCorrente>();

        ContaCorrente conta1 = new ContaCorrente(22, 11);
        ContaCorrente conta2 = new ContaCorrente(22, 22);

        lista.add(conta1);
        lista.add(conta2);

        System.out.println(lista.size());

        ContaCorrente ref = lista.get(0);

        System.out.println(ref.getNumero());

//        lista.remove(0);

        System.out.println(lista.size());

        for(ContaCorrente oRef: lista) {
            System.out.println(oRef);
        }
    }
}
