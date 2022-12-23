public class CartelaLoteria {

    public static void main(String[] args) {
        System.out.println("Imprimindo cartela...\n");

        // ctrl + f8 (criar o break point)
        // shift + 9 (Entrar no modo debug)
        // f8 - step-over
        // f9 - resume program
        // btn direito run cursor (para ir até o cursor no debug)

        int totalNumeros = 60;
        int numerosPorLinha = 10;

        // Criar break point
        // - possibilidade de resume break point
        // - mute break-point simbolo/icone - bola vermelha - com um cortado.
        // - colocar condicao no break-point (btn direito no íconee do break-point)

        // Alterar a variável em tempo de debug.
        // - em Debugger (menu inferior) na lista de variáveis do painel, clicar em btn direito
        //   set value, ou F2

        // ver variável, condicão, ícone calculadora.

        for (int i = 1; i <= totalNumeros; i++) {
            if (i < 10) {
                System.out.print("0");
            }

            System.out.print(i + " ");

            if (i % numerosPorLinha == 0 || i == totalNumeros) {
                System.out.println();
            }
        }

        System.out.printf("%nCartela com %d números impresso com sucesso%n", totalNumeros);
    }

}