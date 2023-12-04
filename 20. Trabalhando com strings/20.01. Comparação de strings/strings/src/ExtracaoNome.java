public class ExtracaoNome {

    public static void main(String[] args) {

        String nome = "João Silva Souza Magalhães";
        //String nome = "João Silva";
        //String nome = "João"; // erro

        /*System.out.println(nome.indexOf(" "));
        System.out.println(nome.substring(5));
        System.out.println(nome.substring(5, 10));
        */

        // pegar o último nome
        //System.out.println(nome.lastIndexOf(" ")); // do primeiro caracter até o último q possui
        //System.out.println(nome.substring(11));


        //System.out.println(obterSobrenome(nome));
        //System.out.println(obterSegundoNome(nome));
        System.out.println(obterUltimoNome(nome));

    }

    private static String obterUltimoNome(String nome) {
        int posicaoUltimoEspaco = nome.lastIndexOf(" ");

        if(posicaoUltimoEspaco < 0) {
            throw new RuntimeException("Não é um nome completo");
        }

        return nome.substring(posicaoUltimoEspaco + 1);
    }

    private static String obterSobrenome(String nome) {
        int posicaoPrimeiroEspaco = nome.indexOf(" ");

        if(posicaoPrimeiroEspaco < 0) {
            throw new RuntimeException("Não é um nome completo");
        }

        return nome.substring(posicaoPrimeiroEspaco + 1);
    }


    private static String obterSegundoNome(String nome) {
        int posicaoPrimeiroEspaco = nome.indexOf(" ");
        int posicaoSegundoEspaco = nome.indexOf(" ", posicaoPrimeiroEspaco + 1);

        if(posicaoPrimeiroEspaco < 0) {
            throw new RuntimeException("Não é um nome completo");
        }

        return nome.substring(posicaoPrimeiroEspaco + 1,
                posicaoSegundoEspaco < 0 ? nome.length() : posicaoSegundoEspaco);
    }

}
