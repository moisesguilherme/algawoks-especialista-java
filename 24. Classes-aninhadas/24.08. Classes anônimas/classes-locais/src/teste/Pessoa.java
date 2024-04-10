package teste;

public class Pessoa {

    public String nome = "padrão";

    public Imprimir teste() {

        //Classe anônima (não tem o nome)
        Imprimir imprimir = new Imprimir() {

            @Override
            public String alteraNome() {
                nome = "alterou nome";
                return nome;
            }

        };

        imprimir.alteraNome();
        return imprimir;
    }


}
