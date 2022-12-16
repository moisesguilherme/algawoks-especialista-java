// Final em classe ela não pode ser extendida
final public class Pessoa {
    final String TIPO_PESSOA = "Pessoa Física";

    void imprimeTipoPessoa(final String preTexto){

        // Erro
        // preTexto = "tentar Alterar";
        System.out.println(preTexto + " " + TIPO_PESSOA);
    }
}
