package dominio;

public class Curso extends Conteudo{
  private int cargaHoraria;



  @Override
  public double calcularXp() {
    return XP_PADRAO * getCargaHoraria();
  }


  public int getCargaHoraria() {
    return this.cargaHoraria;
  }

  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }


  @Override
  public String toString() {
    return "{" +
      " titulo='" + getTitulo() + "'" +
      ", descricao='" + getDescricao() + "'" +
      ", cargaHoraria='" + getCargaHoraria() + "'" +
      "}";
  }


}
