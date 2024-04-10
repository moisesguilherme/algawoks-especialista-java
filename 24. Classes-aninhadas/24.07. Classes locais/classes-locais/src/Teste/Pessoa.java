package Teste;

public class Pessoa {

    private String id;
    private String name;

    // Statica
    public static class ImprimeStatica{
        private static String texto = "Conteudo classe imprime Stática";
        public static void print() {
            System.out.println(texto);
        }
    }

    public class Imprime{
        private String texto = "Conteudo classe imprime não Stática";

        public Imprime(String texto) {
            this.texto = this.texto + " " + texto;
        }

        public void print() {
            System.out.println(texto);
        }
    }

}