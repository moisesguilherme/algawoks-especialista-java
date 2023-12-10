public class FormatacaoCodigo {

    public static void main(String[] args) {

        // 000000000 -> 10 caracteres
        int codigo = 1111123;
        //long codigo = 12131123131L;
        // (codigo  + "") virar string ou String.valueOf(codigo)

        String codigoFormatado = preencherEsquerda(
                String.valueOf(codigo), '0', 10);

        System.out.println(codigoFormatado);

    }

    public static String preencherEsquerda(String texto, char caracter, int tamanhoTotal) {
        if(texto.length() >= tamanhoTotal)
            return texto;

        return String.valueOf(caracter)
                .repeat(tamanhoTotal - texto.length()) + texto;
    }


}
