package br.com.dio.desafio.dominio;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Curso curso1= new Curso();
curso1.setTitulo("curso java");
curso1.setDescricao("descricao curso java");
curso1.setCargaHoraria(5);

Curso curso2 = new Curso();
curso2.setTitulo("Titulo2");
curso2.setDescricao("Descrição 2");
curso2.setCargaHoraria(9);

Conteudo conteudo= new Curso();




        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java");
        mentoria.setDescricao("mentoria java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao(("Descrição Bootcamp Java Developer"));
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBruno = new Dev();
        devBruno.setNome("Bruno");
        devBruno.inscreverBootcamp(bootcamp);
        devBruno.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Bruno"+ devBruno.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Bruno "+ devBruno.getConteudosConcluidos());
        System.out.println("XP: " +devBruno.calcularTotalxp());
        System.out.println("-----------------");

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Carlos "+ devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos Carlos "+ devCarlos.getConteudosConcluidos());
        System.out.println("XP: " +devCarlos.calcularTotalxp());







    }
}