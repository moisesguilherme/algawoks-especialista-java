public class PrecedenciaOperadoresLogicos {

  public static void main(String[] args) {
  
    int x = 10;
    int y = 20; 	

    // operador lógico é sempre é avaliado primeiro
    // boolean resultado = x == 13 && x == 15 || y == 20; //true
    // boolean resultado = (x == 13 && x == 15) || y == 20; //true
    boolean resultado = x == 13 && (x == 15 || y == 20); //false
   
    System.out.println(resultado);
    System.out.printf("valor de y: %d%n", y);
  }

}
