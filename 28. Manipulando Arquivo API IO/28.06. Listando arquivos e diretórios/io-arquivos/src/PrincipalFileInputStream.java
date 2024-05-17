import java.io.*;

public class PrincipalFileInputStream {

    public static void main(String[] args) {
        File arquivoOrigem = new File("docs/contrato.txt");

        // try-with-resource (ele vai ser fechado no final)
        try (InputStream inputStream = new FileInputStream(arquivoOrigem)) {
            int conteudo;

            while ((conteudo = inputStream.read()) != -1) {
                System.out.print((char) conteudo); //problema com acento exemplo: ú
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Arquivo não encontrado", e);
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }
    }
}
