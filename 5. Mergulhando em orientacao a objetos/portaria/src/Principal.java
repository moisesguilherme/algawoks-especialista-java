public class Principal {

    public static void main(String[] args) {
        Visitante novoVisitante = new Visitante();
        novoVisitante.nome = "João";
        novoVisitante.idade = 15;

        if (novoVisitante.idade()) {
            System.out.printf("Acesso não permitido para menores de 18 anos");
        } else {
            System.out.println("Acesso liberado");
        }
    }

}
