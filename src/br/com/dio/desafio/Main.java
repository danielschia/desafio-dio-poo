import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;
import java.time.LocalDate;

public class Main {

  public static void main(String[] args) {

    Curso curso1 = new Curso();
    curso1.setTitulo("Curso Java");
    curso1.setDescricao("Descrição curso Java");
    curso1.setCargaHoraria(8);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria de Java");
    mentoria.setDescricao("Descrição mentoria Java");
    mentoria.setData(LocalDate.now());

    // System.out.println(curso1);
    // System.out.println(mentoria);

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descrição Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(mentoria);

    System.out.println("XP total que o Bootcamp Java Developer tem: " + bootcamp.xpTotal());


    Dev dev = new Dev();
    dev.setNome("Daniel");
    dev.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos Inscritos Daniel: " + dev.getConteudosInscritos());
    dev.progredir();
    dev.progredir();
    System.out.println("Conteudos Inscritos Daniel: " + dev.getConteudosInscritos());
    System.out.println("XP Daniel: " + dev.calcularXp());

    Dev dev2 = new Dev();
    dev2.setNome("João");
    dev2.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos Inscritos João: " + dev2.getConteudosInscritos());
    dev2.progredir();
    System.out.println("Conteudos Concluídos João: " + dev2.getConteudosConcluidos());
    System.out.println("XP João: " + dev2.calcularXp());
  }
}
