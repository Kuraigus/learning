package com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {
    public static void main(String[] args) throws Exception {

//        Cliente cliente = new Cliente();
//        cliente.setNome("nico");
//        cliente.setProfissao("dev");
//        cliente.setCpf("111111111");


        //        String nome = "Joao Victor";

//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//        oos.writeObject(cliente);
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();

        System.out.println(cliente.getCpf());
        System.out.println(cliente.getNome());
        System.out.println(cliente.getProfissao() );


//        System.out.println(nome);

    }
}
