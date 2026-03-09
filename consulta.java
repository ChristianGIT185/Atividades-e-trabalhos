
import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta {

  private LocalDate data;
  private LocalTime hora;
  private String medico;
  private String paciente;
  private String motivo;
  private String historico;

  public Consulta() {
  }

  public Consulta(LocalDate data, LocalTime hora, String medico, String paciente, String motivo, String historico) {
    this.data = data;
    this.hora = hora;
    this.medico = medico;
    this.paciente = paciente;
    this.motivo = motivo;
    this.historico = historico;
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public LocalTime getHora() {
    return hora;
  }

  public void setHora(LocalTime hora) {
    this.hora = hora;
  }

  public String getMedico() {
    return medico;
  }

  public void setMedico(String medico) {
    this.medico = medico;
  }

  public String getPaciente() {
    return paciente;
  }

  public void setPaciente(String paciente) {
    this.paciente = paciente;
  }

  public String getMotivo() {
    return motivo;
  }

  public void setMotivo(String motivo) {
    this.motivo = motivo;
  }

  public String getHistorico() {
    return historico;
  }

  public void setHistorico(String historico) {
    this.historico = historico;
  }

  public void marcar() {
    System.out.println("Consulta marcada!");
  }

  public void cancelar() {
    System.out.println("Consulta cancelada!");
  }

  public void consultar() {
    System.out.println("Sistema acessado!");
  }

  public void realizar() {
    System.out.println("Consulta realizada!");
  }

  public void atualizar() {
    System.out.println("Consulta atualizada!");
  }

  public void mostrar() {
    System.out.println("Médico: " + medico);
    System.out.println("Paciente: " + paciente);
    System.out.println("Razão da consulta: " + motivo);
    System.out.println("Histórico do paciente: " + historico);
    System.out.println("Data da consulta: " + data);
    System.out.println("Hora da consulta: " + hora);
  }

}
