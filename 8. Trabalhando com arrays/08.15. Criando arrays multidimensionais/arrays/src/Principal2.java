public class Principal2 {

    public static void main(String[] args) {
        // Array tridimencional
        String[][][] cidades = new String[2][2][2];

        cidades[0][0][0] = "Uberlândia";
        cidades[0][0][1] = "Uberaba";

        // Preencher todos linha 0
        cidades[0][1][0] = "Cidade X";
        cidades[0][1][1] = "Cidade Y";

        // Preencher todos linha 1
        cidades[1][0][0] = "Preencheu 1";
        cidades[1][0][1] = "Preencheu 2";
        cidades[1][1][0] = "Preencheu 3";
        cidades[1][1][1] = "Preencheu 4";


    }

}

