import java.util.Scanner;

public class ControlePesoAeronave {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Peso máximo da aeronave: ");
    int pesoMaximo = entrada.nextInt();
    
    /*System.out.print("Quantidade de passageiros: ");
    int totalPassageiros = entrada.nextInt();
    */
    
    int pesoTotalPassageiros = 0;
    
    /*
    for (int passageiroAtual = 1; passageiroAtual <= totalPassageiros; passageiroAtual++) {
       System.out.printf("Peso do passageiro #%d: ", passageiroAtual);
       int pesoPassageiro = entrada.nextInt();
       
       pesoTotalPassageiros += pesoPassageiro;
    }*/
    
    /*int passageiroAtual = 1;
    
    while(passageiroAtual <= totalPassageiros) {
       System.out.printf("Peso do passageiro #%d: ", passageiroAtual);
       int pesoPassageiro = entrada.nextInt();
       
       pesoTotalPassageiros += pesoPassageiro;
       passageiroAtual++;    
    }*/
    
    boolean incluirNovoPassageiro = true;
    
    // while é ideal quando vc não tem informação de quando vai parar
    while(pesoTotalPassageiros <= pesoMaximo && incluirNovoPassageiro) {
       System.out.print("Peso do passageiro : ");
       int pesoPassageiro = entrada.nextInt();
       
       pesoTotalPassageiros += pesoPassageiro;
       System.out.print("Incluir novo passageiro? ");
    }
    
    
    System.out.printf("Peso máximo da aeronave: %d kg%n", pesoMaximo);
    System.out.printf("Peso total dos passageiros: %d kg%n", pesoTotalPassageiros);
    System.out.printf("Situação da aeronave: %s%n", 
        pesoTotalPassageiros > pesoMaximo ? "peso excedido" : "liberada");
    
  }

}
