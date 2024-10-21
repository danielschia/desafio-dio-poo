import dominio.Curso;
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

    System.out.println(curso1);
    System.out.println(mentoria);
  }
}
