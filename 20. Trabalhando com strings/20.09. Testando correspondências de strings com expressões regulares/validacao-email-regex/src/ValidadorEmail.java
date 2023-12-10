import java.util.regex.Pattern;

public class ValidadorEmail {

    public static boolean validar(String email) {
        // Passando o email
        //return Pattern.matches("[\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3}", email);
        // Outra forma de verificar usando o método email.matches
        return email.matches("[\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3}");

    }

}
