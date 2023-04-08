public class Principal {

    public static void main(String[] args) {
        Integer numero1 = 128;
        Integer numero2 = 128;

        // com int vai dar true comparando.
        // com o Integer vai comparar objetos, não o conteúdo do objeto.
        // o número1 aponta para o mesmo endereco de memoria, como:
        // existe o integerCache na classe Integer, que vai instanciar o mesmo objeto que tiver o mesmo valor.
        // na faixa de -128 até 127
        System.out.println(numero1 == numero2);
    }

}
