package br.com.alura;

import java.util.Collections;
import java.util.Set;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando colecoes do java", "Paulo Silveira");

        javaColecoes.adicionaAula(new Aula("Trabalhando com aulas", 20));
        javaColecoes.adicionaAula(new Aula("Criando uma aula", 15));
        javaColecoes.adicionaAula(new Aula("Modelando com colecoes", 22));


        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos alunos matriculados: ");

        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });

        Set<String> nomes = Collections.emptySet();
        nomes.add("Paulo");

        System.out.println(nomes);


    }
}
