public class ConversaoFloatParaDouble{

  public static void main(String[] args) {
  	  
	  double peso1 = 20.5; // 64 bits	  
          float peso2 = (float) peso1; // 32 bits
          
  	  System.out.println(peso1);
  	  System.out.println(peso2);
  	  
  	  float taxa1 = 934.5f;
  	  double taxa2 = (double) taxa1; // instrução de casting é opcional
  	  
   	  System.out.println(taxa1);
   	  System.out.println(taxa2);

  }

}
