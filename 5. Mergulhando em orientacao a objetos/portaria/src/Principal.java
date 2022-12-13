public class Principal {

    public static void main(String[] args) {
        Visitante novoVisitante = new Visitante();
        novoVisitante.nome = "João";
        novoVisitante.idade = 15;

        /*if (novoVisitante.idade < Visitante.IDADE_MINIMA_ACESSO_IRRESTRITO) {
            System.out.printf("Acesso não permitido para menores de %d anos",
                    Visitante.IDADE_MINIMA_ACESSO_IRRESTRITO);
        } else {
            System.out.println("Acesso liberado");
        }*/

        if (novoVisitante.possuiAcessoRestritoPorIdade()) {
            System.out.printf("Acesso não permitido para menores de %d anos",
                    Visitante.IDADE_MINIMA_ACESSO_IRRESTRITO);
        } else {
            System.out.println("Acesso liberado");
        }
    }

}
