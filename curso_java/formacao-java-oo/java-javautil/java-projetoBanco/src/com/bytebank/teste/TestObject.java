package com.bytebank.teste;

import com.bytebank.model.Cliente;
import com.bytebank.model.ContaCorrente;
import com.bytebank.model.ContaPoupanca;

public class TestObject {

    public static void main(String[] args) {
//        System.out.println("x");
//        System.out.println(3);
//        System.out.println(false);

        ContaCorrente cc = new ContaCorrente(22, 33);
        ContaPoupanca cp = new ContaPoupanca(33, 22);
        Cliente c = new Cliente();

        System.out.println(cc);
        System.out.println(cp);
    }

    static void println() {}
    static void println(int a) {}
    static void println(boolean b) {}
    static void println(Object objeto){}

}
