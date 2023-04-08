public class Principal3 {

    public static void main(String[] args) {
        long tempoInicio = System.currentTimeMillis();

        // long soma = 0L;
        // com primitivo log o tempo é de 0.82s
        // com L Long tipo wrapper. o tempo é de 7.56 segundos
        Long soma = 0L;
        for (long i = 0; i< Integer.MAX_VALUE; i++) {
            // em soma + i, ele faz o unboxing do valor, ao atribuir ao tipo wrapper em soma vai fazer boxing.
            // por esse motivo é mais lento.
            soma = soma + i;
        }

        System.out.println(soma);

        double duracao = (System.currentTimeMillis() - tempoInicio) / 1000d;
        System.out.printf("Duração: %.2fs%n", duracao);
    }

}
