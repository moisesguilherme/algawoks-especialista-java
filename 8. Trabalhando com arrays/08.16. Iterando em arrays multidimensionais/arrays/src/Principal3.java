import java.util.Arrays;

public class Principal3 {

    public static void main(String[] args) {
        String[][] todasCidades = new String[3][];
        todasCidades[0] = new String[3];
        todasCidades[0][0] = "Uberlândia";
        todasCidades[0][1] = "Uberaba";
        todasCidades[0][2] = "Belo Horizonte";

        todasCidades[1] = new String[2];
        todasCidades[1][0] = "São Paulo";
        todasCidades[1][1] = "Ribeirão Preto";

        todasCidades[2] = new String[1];
        todasCidades[2][0] = "Fortaleza";

        /*
        for (int i = 0; i < todasCidades.length; i++) {
            // todas as linhas
            System.out.println(Arrays.toString(todasCidades[i]));
        }
        */

        /*for (int i = 0; i < todasCidades.length; i++) {
            for (int j = 0; j < todasCidades[i].length; j++) { // i primeira dimensão
                System.out.printf("[%d][%d] = Cidade: %s%n", i, j, todasCidades[i][j]); // j segunda dimensão
            }
        }*/
        
        //Enhenced for (não trabalha com indice)
        for (String[] cidadesPorEstados : todasCidades) {
            for (String cidade : cidadesPorEstados) {
                System.out.println("Cidade: " + cidade);
            }
        }
        

    }

}
