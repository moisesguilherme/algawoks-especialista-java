import java.io.*;

public class PrincipalFileReader {


    public static void main(String[] args)  {
        File arquivoOrigem = new File("docs/contrato.txt");
        StringBuilder texto = new StringBuilder();

        // try-with-resource
        try (Reader leitor = new FileReader(arquivoOrigem)) {
            char[] conteudo = new char[1000]; // mil caracteres
            int quantidadeCaracteres;

            while((quantidadeCaracteres = leitor.read(conteudo)) > 0) {
                System.out.println(">>> " + quantidadeCaracteres);
                texto.append(conteudo, 0, quantidadeCaracteres);
            }
            System.out.println(">>> " + quantidadeCaracteres);
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }

        System.out.println(texto); // Agora funciona os caracteres
    }

}
