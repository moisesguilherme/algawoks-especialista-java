import java.util.Scanner;

public class NovaFuncionalidadeSwitch {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite um dia da semana (ex: seg, ter, qua, etc): ");
    String diaSemana = entrada.nextLine();
    String horarioFuncionamento;

    // Arrow label -> Nova funcionalidade do Switch no Java 14
    // Não tem break
    
    switch (diaSemana) {
      case "seg" -> horarioFuncionamento = "Fechado";
      case "ter", "qua", "qui", "sex" -> horarioFuncionamento = "08:00 às 18:00";
      case "sab", "dom" -> horarioFuncionamento = "08:00 às 12:00";
      default ->  { 
         horarioFuncionamento = "Dia inválido";
      }      
    }

    System.out.printf("Horário de funcionamento: %s%n", horarioFuncionamento);
  }

}
