public class Principal {

    public static void main(String[] args) {

        // Remove Wrapper (boxing)
        // a partir do java 5 não precisa fazer o wrapper (tem a funcionalidade chamada auto-boxing)
        // o compilador embrulha o valor em um objeto tipo integer.
        // Integer diasEntrega = Integer.valueOf(30);
        // equivalente a
        Integer diasEntrega = 30;

        // remover o unboxing
        //int diasEntregaInt = diasEntrega.intValue();
        // aqui o compilador faz o auto-unboxing.
        int diasEntregaInt = diasEntrega;

    }

}
