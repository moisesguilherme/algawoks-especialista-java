public class Principal {

    public static void main(String[] args) {

        long tempoInicio = System.currentTimeMillis();

        //String texto = "";
        StringBuilder sb = new StringBuilder(210_000); // trabalha com array,
        // colocar o tamanho vai evitar fazer copia para redmencionar o array


        for (int i = 0; i < 200_000; i++) {
            //texto = texto + "#"; //imutável, precisa criar outra string
            sb.append("#"); //mutável
        }


        //System.out.println(texto);
        System.out.println(sb.toString());

        double duracao = (System.currentTimeMillis() - tempoInicio) / 1000d;
        System.out.printf("Duracão: %.2fs%n", duracao);


    }

}