public class Principal {

    public static void main(String[] args) {

        /// Java 15 -> text blocks

        /*String html = "<a href=\"mailto:joao@gmail.com\">\n   joao@gmail.com  </a>\n" +
                "<a>\n   abc@algaworks.com</a><a>xyz@algaworks.com</a>" +
                "<strong>maria@algaworks.com</strong>";
         */

        // replace with intellij (replace with text blocks)
        String nome = "João da Silva";

        String html = """
                <a href="mailto:joao@gmail.com">
                   %s - </a>
                <a>
                   abc@algaworks.com</a><a>xyz@algaworks.com</a><strong>maria@algaworks.com</strong>
                   
                   """.formatted(nome);

        System.out.println(html);

    }

}
