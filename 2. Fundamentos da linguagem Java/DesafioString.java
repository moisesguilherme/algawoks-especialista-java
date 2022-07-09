import java.util.Scanner;

public class DesafioString {

  public static void main(String[] args) {
  	 
  	 Scanner entrada = new Scanner(System.in);
  	 
  	 System.out.print("Nome: ");  	 
  	 String nome = entrada.nextLine(); 

   	 System.out.print("Valor da hora: ");
   	 double valorHora = entrada.nextDouble();

   	 System.out.print("Horas trabalhadas: ");
   	 int totalHoras = entrada.nextInt();  	 
 	 
  	 System.out.print("Valor dos descontos: ");
   	 double desconto = entrada.nextDouble();
   	 
   	 double totalReceber = valorHora * totalHoras;
   	 double totalDevido = totalReceber - desconto;

  	 System.out.println("---------------------------");
  	 System.out.printf("Folha de pagamento: %s%n%d horas x R$%.2f = R$%.2f %nDescontos: R$%.2f%nTotal devido: R$%.2f%n", nome, totalHoras, valorHora, totalReceber, desconto, totalDevido);	    	   	   	 
  }

}
