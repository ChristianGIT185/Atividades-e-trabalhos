import java.util.scanner


public class app{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

        Medico medicoA = new Medico(
            "João",
            "CRM/SP 000001",
            "+55 11 00000-0001",
            "Fisioterapia",
            "12345"
        );

        Paciente pacienteA = new Paciente(
            "Jonas",
            "123.456.789-44",
            "+55 11 00000-0002",
            true,
            24
        );

        Recepcionista recepcionistaA = new Recepcionista(
            "Manuel",
            "987.654.321-44",
            "+55 11 00000-0003",
            "67890"
        );

        Agenda agendaA = new Agenda(
            "30/02/2026",
            "18:00",
            medicoA,
            pacienteA
        );

        Consulta consultaA = new Consulta(
            "30/02/2026",
            "18:00",
            medicoA,
            pacienteA,
            "Recuperação de perna quebrada",
            "Primeira sessão"
        );

        Receita receitaA = new Receita(
            consultaA,
            "30/02/2026",
            "Relaxante muscular"
        );

        Exame exameA = new Exame(
            consultaA,
            "05/03/2026",
            "Raio-X da perna"
        );

        System.out.print("informe a senha da recepcionista: ");
        String senhaRecep = scanner.nextLine();

        if(recepcionistaA.acessar(senhaRecep))
        {
            pacienteA.cadastrar();
            pacienteA.consultar();
            agendaA.consultar();
        }

        System.out.print("\nInforme a senha do médico: ");
        String senhaMedico = scanner.nextLine();

        if(medicoA.acessar(senhaMedico))
        {
            consultaA.marcar();
            consultaA.consultar();
            consultaA.realizar();
            consultaA.atualizar();

            receitaA.prescrever();
            receitaA.consultar();

            exameA.solicitar();
            exameA.consultar();
        }

        scanner.close();
    }
}
  }
}
