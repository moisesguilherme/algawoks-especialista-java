public class ConversaoLongParaInt{

  public static void main(String[] args) {
  	  
	  long x = 4294967296L; //64bits
	  //int y = x;   //32bits
	  
	  int y = (int) x;
	  
  	  System.out.println(x);
  	  System.out.println(y);

  }

}
