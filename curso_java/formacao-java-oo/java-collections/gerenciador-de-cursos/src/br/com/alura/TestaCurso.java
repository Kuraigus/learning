package br.com.alura;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando colecoes do java", "Paulo Silveira");

        List<Aula> aulas = javaColecoes.getAulas();
        System.out.println(aulas);

//        aulas.add(new Aula("Trabalhando com ArrayList", 21));


        javaColecoes.adicionaAula(new Aula("Trabalhando com aulas", 20));
        javaColecoes.adicionaAula(new Aula("Criando uma aula", 15));
        javaColecoes.adicionaAula(new Aula("Modelando com colecoes", 22));

        System.out.println(aulas);


    }
}
