public class OlaMergulhador {

    public static void main(String[] args) {
        // Atalhos do IntelliJ IDEA
        // CTRL + Alt + L -> Formatar
        // Shift + f6 selecionando a variável/classe para mudar o nome em _todo o programa
        // Shift + 10 -> para rodar o projeto ativo (no select run)
        // Ctrl + Shift + 10 -> para rodar o projeto aberto
        // Ctrl + N -> achar uma classe (pesquisar)
        // Ctrl + Shift + N -> achar um arquivo
        // Ctrl + Shift + A -> achar actions

        int totalTeste = 3; // Identar uma linha CTRL + ALT + i;
        int teste2; // Duplicar CTRL + D;
        int teste3; // Apagar uma linha CTRL + Y
        // Shift + enter quebrar a linha sem dividir, com cursor no meio da palavra.

        boolean pendente = true;
        // Code completion

        // Live Templates
        // fori
        for (int i = 0; i < 10; i++) {
            // soutv
            System.out.println("gastos = " + i + " " + totalTeste);
        }

        // Posfix Completion
        // total.sout
        System.out.println(totalTeste);
        // total.souv
        System.out.println("total = " + totalTeste);
        // pendente.if
        if (pendente) {

        }
        // pendente.while
        while (pendente) {

        }
        // total.fori
        for (int i = 0; i < totalTeste; i++) {

        }
        // total.forr
        for (int i = totalTeste; i > 0; i--) {

        }

        // Ver cursor para alterar mais de uma linha
        System.out.println("Alterar texto"); // Ctrl + shift + j (Junta duas linhas)
        System.out.println("Alterar texto");
        System.out.println("Alterar texto");
        System.out.println("Alterar texto");

        //ctrl + j (lista de template)
        for (int i = 0; i < totalTeste ; i++) {

        }


    }

}
