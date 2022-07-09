public class ConversaoWidening{

  public static void main(String[] args) {
  	  
	  byte  varByte = 127; // 1 byte 8 bits
	  short varShort = 32_767;    // 2 bytes 16 bits
	  int   varInt = 100; //2_147_483_647; // 4 bytes 32 bits
	  long varLong = 9_223_372_036_854_775_807L; // 8 bytes 64 bits

	  float varFloat = 100.00f;  // 4 bytes 32 bits
	  double varDouble = 100.00d; // 8 bytes 64 bits
	  boolean varBoolean = true; // 1 bit
	  char varChar = 'A'; // 2 bytes // 2 bytes 16 bits
	  
	  //Widening casting
	  
	  short resultadoShort = varByte;
   	  System.out.println(resultadoShort);
   	  int resultadoInt = varShort;
	  System.out.println(resultadoInt);
	  float resultadoFloat = varInt;
  	  System.out.println(resultadoFloat);
	  //long resultadoLong = varInt;
   	  //System.out.println(resultadoFloat);
   	  //System.out.println(varLong);
  }

}
