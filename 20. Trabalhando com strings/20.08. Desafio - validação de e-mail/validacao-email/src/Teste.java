import org.w3c.dom.ls.LSOutput;

public class Teste {

    public static void main(String[] args) {
        char c = 't';

        System.out.println(Character.isLetter(c));
        System.out.println(Character.isLowerCase(c));
        System.out.println(Character.isDigit(c));


        String teste = "teste@gmail.com";

        System.out.println(teste.substring(0, teste.indexOf("@")));

    }



}
