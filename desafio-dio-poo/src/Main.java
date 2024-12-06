import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso Básico Java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("RUST");
        curso2.setDescricao("Curso Básico RUST");
        curso2.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Agende sua Mentoria Java");
        mentoria.setData(LocalDate.now());

        /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp para aspirantes Devs Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAle = new Dev();
        devAle.setNome("Alexandre");
        devAle.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Alexandre: " + devAle.getConteudosInscritos());
        devAle.progredir();
        devAle.progredir();
        
        System.out.println("----------");
        
        System.out.println("Conteúdos Inscritos Alexandre: " + devAle.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Alexandre: " + devAle.getConteudosConcluidos());
        System.out.println("XP:" + devAle.calcularTotalXp());
        
        System.out.println("----------------------------------------------------------------");
        
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        
        System.out.println("----------");
        
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        
    }

}
