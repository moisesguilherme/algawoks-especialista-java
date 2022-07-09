public class FormatandoComPrintf {

  public static void main(String[] args) {
  	  
 	  String nome1 = "Moisés";
  	  System.out.printf("Olá, %s%n", nome1);
  	  
  	  int quantidade = 48;
  	  // %d números inteiros
  	  System.out.printf("Quantidade: %d itens%n", quantidade); 
  	  
  	  double peso = 938.22;
  	  System.out.printf("Peso: %10.2f%n", peso);
  }

}
