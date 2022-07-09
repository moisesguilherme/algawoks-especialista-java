public class ConversaoIntParaLong{

  public static void main(String[] args) {
  	  
	  int y = 102344; //32bits 
	  
	  // long x = y;   //64 bits
	  long x = (long) y;  // instrução de casting é opcional
	  
	  //int y = (int) x;
	  
  	  System.out.println(y);
  	  System.out.println(x);

  }

}
