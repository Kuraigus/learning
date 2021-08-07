package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class TestaAlunos {

    public static void main(String[] args) {
        Collection<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");

//        alunos.remove("Nico Steppat");

        for (String aluno: alunos) {
            System.out.println(aluno);
        }

    }
}
