import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(6);

        Conteudo conteudo = new Mentoria();
        Conteudo conteudo1 = new Mentoria();

        List<String> palavras = new ArrayList<>();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("BootCamp Java Dev");
        bootcamp.setDescricao("Descrição BootCamp Java Dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        DEV devFulano = new DEV();
        devFulano.setNome("Fulano");
        devFulano.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos Inscritos Fulano:" + devFulano.getConteudosInscritos());
        devFulano.progredir();
        devFulano.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos Fulano:" + devFulano.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Fulano:" + devFulano.getConteudosConcluidos());

        System.out.println("--------");

        DEV devSiclano = new DEV();
        devFulano.setNome("Siclano");
        devSiclano.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos Inscritos Siclano:" + devSiclano.getConteudosInscritos());
        devSiclano.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos Siclano:" + devSiclano.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Siclano:" + devSiclano.getConteudosConcluidos());



    }
}
