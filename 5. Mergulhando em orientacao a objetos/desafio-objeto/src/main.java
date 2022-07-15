public class main {

    public static void main(String[] args) {

          Cachorro cachorro1 = new Cachorro();
          cachorro1.nome = "Teca";
          cachorro1.raca = "Pinscher";
          cachorro1.sexo = 'F';
          cachorro1.idade = 10;


          Cachorro cachorro2 = new Cachorro();
          cachorro2.nome = "Tina";
          cachorro2.raca = "Pequinês";
          cachorro2.sexo = 'F';
          cachorro1.idade = 5;

          System.out.printf("Nome: %s%nRaca: %s%nSexo: %s%nIdade: %d", cachorro1.nome, cachorro1.raca,
                  cachorro1.sexo, cachorro1.idade);
          System.out.println("\n----------------");
          System.out.printf("Nome: %s%nRaca: %s%nSexo: %s%nIdade: %d", cachorro2.nome, cachorro2.raca,
                  cachorro2.sexo, cachorro2.idade);

    }
}
