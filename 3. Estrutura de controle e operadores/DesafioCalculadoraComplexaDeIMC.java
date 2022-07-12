import java.util.Scanner;

public class CalculadoraIndiceMassaCorporalComElse {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Peso: ");
    int peso = entrada.nextInt();

    System.out.print("Altura: ");
    double altura = entrada.nextDouble();

    System.out.print("Digite F para feminino e M para masculino: ");
    char sexo = entrada.next().charAt(0);
    
    double imc = peso / (altura * altura);
   
    
    
    if (sexo == 'F') {
      System.out.println("IMC em mulheres.");      
    } else {
      System.out.println("IMC em homens.");
      if (imc < 20.7) {
	System.out.println("Abaixo do peso.");
      } else if (imc < 26.4) {
	System.out.println("No peso ideal.");
      } else if (imc < 27.8) {
	System.out.println("Um pouco acima do peso.");
      } else if (imc < 31.1) {
        System.out.println("Acima do peso ideal.");
      } else {
	System.out.println("Acima do peso.");
      } 
    }
        
    System.out.println("Fim do programa.");    	    	     	
    
  }
}
