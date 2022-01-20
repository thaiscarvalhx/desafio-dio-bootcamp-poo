package br.com.dio.desafio.dominio;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Linguagem Java");
        curso1.setCargaHoraria(6);
        curso1.setDescricao("Programação Orientada a Objetos");

        Curso curso2 = new Curso();
        curso2.setTitulo("Linguagem Java");
        curso2.setCargaHoraria(4);
        curso2.setDescricao("Collections Java");

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Como se dedicar a aprender uma linguagem");
        mentoria1.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Thaís");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("\n" + "Conteudos Inscritos Thaís" + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("========");
        System.out.println("\n" + "Conteudos Inscritos Thaís" + dev1.getConteudosInscritos());
        System.out.println("\n" + "Conteudos Concluídos Thaís" + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularXp());

        System.out.println("======================");

        Dev dev2 = new Dev();
        dev2.setNome("Lucas");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("\n" + "Conteudos Inscritos Lucas" + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("========");
        System.out.println("\n" + "Conteudos Inscritos Lucas" + dev2.getConteudosInscritos());
        System.out.println("\n" + "Conteudos Concluídos Lucas" + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularXp());

    }
}
