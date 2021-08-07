package com.bytebank.teste;

import com.bytebank.model.*;
import com.bytebank.model.Conta;

public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321);

        conta.deposita(200.0);

        try {
            conta.saca(200.0);
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
    }
}
