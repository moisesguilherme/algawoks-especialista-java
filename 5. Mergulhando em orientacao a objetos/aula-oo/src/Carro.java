public class Carro {

    // Atributos ou propriedades
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    Pessoa proprietario;

    void calcularValorRevenda() {
        System.out.printf("Calcular valor de revenda de: %s %d%n",
                modelo, anoFabricacao);
    }

}