// Final em classe ela não pode ser extendida
final public class Pessoa {
    static final String TIPO_PESSOA = "Pessoa Física";
    static final String COMPARTILHADO = "Propriedade compartilhada";

    // Quando o Método é stático internamente tem q fazer referências a tipos também estático
    // e não da instância da classe
    static void imprimeTipoPessoa(final String preTexto){

        // Erro
        // preTexto = "tentar Alterar";
        System.out.println(preTexto + " " + Pessoa.TIPO_PESSOA);


    }
}
