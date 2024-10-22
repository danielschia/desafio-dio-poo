package dominio;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

  private String nome;
  private String descricao;
  private LocalDate dataInicial = LocalDate.now();
  private LocalDate dataFinal = dataInicial.plusDays(45);
  private Set<Dev> devsInscritos = new LinkedHashSet<>();
  private Set<Conteudo> conteudos = new LinkedHashSet<>();


  public double xpTotal() {
    return this.conteudos
        .stream()
        .mapToDouble(conteudo -> conteudo.calcularXp())
        .sum();
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return this.descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public LocalDate getDataInicial() {
    return this.dataInicial;
  }

  public void setDataInicial(LocalDate dataInicial) {
    this.dataInicial = dataInicial;
  }

  public LocalDate getDataFinal() {
    return this.dataFinal;
  }

  public void setDataFinal(LocalDate dataFinal) {
    this.dataFinal = dataFinal;
  }

  public Set<Dev> getDevsInscritos() {
    return this.devsInscritos;
  }

  public void setDevsInscritos(Set<Dev> devsInscritos) {
    this.devsInscritos = devsInscritos;
  }

  public Set<Conteudo> getConteudos() {
    return this.conteudos;
  }

  public void setConteudos(Set<Conteudo> conteudos) {
    this.conteudos = conteudos;
  }

  public boolean equals(Object o) {
    if (o == this) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Bootcamp bootcamp = (Bootcamp) o;
    return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
  }

  public int hashCode() {
    return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
  }
}
