package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando colecoes do java", "Paulo Silveira");



        javaColecoes.adicionaAula(new Aula("Trabalhando com aulas", 20));
        javaColecoes.adicionaAula(new Aula("Criando uma aula", 15));
        javaColecoes.adicionaAula(new Aula("Modelando com colecoes", 22));


        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println(javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);


    }
}
