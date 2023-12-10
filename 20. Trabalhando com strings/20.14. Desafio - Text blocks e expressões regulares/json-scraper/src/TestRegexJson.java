import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegexJson {

    public static void main(String[] args) {

        String json = """
                {
                    "id": 1,
                    "nome": "João da Silva"
                },
                {
                    "id": 2,
                    "nome":"Maria Abadia"
                },
                {
                    "id": 3,
                    "nome":
                        "Sebastião Carvalho"
                }""";

        // problema: escapar o { }
        String regex = "\\{[^{}]*\\}";

        /*
       - Onde '\\{' corresponde ao { existente na String, escapada por \\.

       - O '[^{}]*' corresponde a qualquer sequência de caracteres que não sejam chaves { ou }, lembrando que o ^ significa uma negação então, qualquer coisa diferente do {}, e o * significa que a sequência pode ocorrer de zero a muitas vezes

       - E por fim \\} indica o final do grupo a ser encontrado pela String '}', usando \\ para escapar assim como o do começo.
       */


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(json);

        while (matcher.find()){
            //System.out.println(matcher.group("nome"));
            System.out.println(matcher.group(0));
        }

    }

}
