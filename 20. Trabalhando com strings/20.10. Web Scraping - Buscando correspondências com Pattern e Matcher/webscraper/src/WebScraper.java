import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebScraper {

    public static void main(String[] args) {
        String html = "<a href=\"mailto:joao@gmail.com\">\n   joao@gmail.com  </a>\n" +
                "<a>\n   abc@algaworks.com</a><a>xyz@algaworks.com</a>" +
                "<strong>maria@algaworks.com</strong><strong>zezinho@algaworks.com</strong>" +
                "<b>  (34)993311-12</b>" +
                "<b>(34)9944111-32</b>" +
                "<b>(34)9933322-12</b>";
  //      System.out.println(html);

        //String regex = "<strong>(.*)</strong>";
        // <.*> -> vai * (qualquer coisa até o último>
        // <.*?> -> até encontrar o >
        // \\s* espacos
        // ?<email> - para nomear

        //String regex = "<.*?>\\s*(?<email>[\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3})\\s*</.*?>";
        String regexTel = "<b>\\s*(\\(\\d{2}\\)\\d[0-9]+\\-+\\d[0-9]{0,2})</b>";

        /*Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(html);

        while (matcher.find()){
            System.out.println(matcher.group("email"));
        }*/

        Pattern pattern2 = Pattern.compile(regexTel);
        Matcher matcher2 = pattern2.matcher(html);

        while (matcher2.find()){
            System.out.println(matcher2.group(1));
        }

    }

}
