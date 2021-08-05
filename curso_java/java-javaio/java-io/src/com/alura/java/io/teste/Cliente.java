package com.alura.java.io.teste;

import java.io.Serializable;

/**
 * classe representando o Cliente do bytebank.
 * 
 * @author(autor da classe) Joao Victor
 * @version(versao da classe) 0.1
 * @param(parametro de metodo e construtor)
 * @return(retorno no metodo)
 * @exception ou @throws (exceptions e throwables no metodo ou construtor)
 * @see(?)
 * @since(?)
 * @serial(?)
 * @deprecated(?)
 */
public class Cliente implements Serializable {



    private String nome;
    private String cpf;
    private String profissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

}