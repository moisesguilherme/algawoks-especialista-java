import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegexEmail {

    public static void main(String[] args) {

        //Site com lista de regex para email
        //https://www.oreilly.com/library/view/regular-expressions-cookbook/9781449327453/ch04s01.html

        String html = "<b>teste@gmail.com</b><b>teste@teste.teste.com.br</b>";

        //String regex = "<.*?>\s*([\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[A-Z0-9-]+\\.)+[A-Z]{2,6}$)\s*</.*?>";
        String regex = "<.*?>\\s*([\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3})\\s*</.*?>";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(html);

        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }

    }



}