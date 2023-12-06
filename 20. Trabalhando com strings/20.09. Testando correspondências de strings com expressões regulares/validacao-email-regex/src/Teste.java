import java.util.regex.Pattern;

public class Teste {

    public static void main(String[] args) {

        //String email = "aaA.111_aaa@al-aga.work.com";
        String email = "luciano@xxx.com.br.xxx";

        //String email = "#aaa111_aaa@alagaworkcom";
        //String email = "@.";

        // -> regex
        // .  -> qualquer coisa
        // X* -> Quantificador
        // + -> Uma ou mais
        // \w -> letras a-z minúsculo, AZ, _ , e números de 0-9
        // {2,3} -> no mínimo 2 e no máximo 3
        // [a-z] -> todas as letras minúscula de a até z
        // [\\w.-]+ -> tudo do \w mais o ponto (.) e o (_) underscore
        // \\d -> dígitos números
        //boolean valido = Pattern.matches("@\\.", email);  //-> "@."
        //boolean valido = Pattern.matches("[\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3}", email);

        // Regex da RFC822
        boolean valido = Pattern.matches("([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})", email);

        System.out.println(valido);


    }

}
