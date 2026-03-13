import java.LocalDate
  
public class exame{
  private String data;
  private String consulta;
  private String descritivo;
}
public exame(){
}

 public Exame(LocalDate data, String consulta, String descritivo) {
    try {
      this.data = data;
      this.consulta = consulta;
      this.descritivo = descritivo;
    } catch (Exception e) {
      this.data = null;
      this.consulta = "";
      this.descritivo = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    try {
      this.data = data;
    } catch (Exception e) {
      this.data = null;
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public String getConsulta() {
    return consulta;
  }

  public void setConsulta(String consulta) {
    try {
      this.consulta = consulta;
    } catch (Exception e) {
      this.consulta = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public String getDescritivo() {
    return descritivo;
  }

  public void setDescritivo(String descritivo) {
    try {
      this.descritivo = descritivo;
    } catch (Exception e) {
      this.descritivo = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public void solicitar() {
    System.out.println("Exame solicitado");
  }

  public void consultar() {
    System.out.println("Exame consultado");
  }

  public void mostrar() {
    System.out.println(">>> Exame <<<");
    System.out.println("Data: " + data);
    System.out.println("Consulta: " + consulta);
    System.out.println("Descrição: " + descritivo);
  }

}
