import java.io.*;

public class PrincipalFileInputStream {

    public static void main(String[] args) {
        File arquivoOrigem = new File("docs/foto1.jpg");
        File arquivoDestino = new File("docs/foto2.jpg");

        try (InputStream inputStream = new FileInputStream(arquivoOrigem);
             OutputStream outputStream = new FileOutputStream(arquivoDestino)) {

            int conteudo;

            while ((conteudo = inputStream.read()) != -1) {
                System.out.println(conteudo);
                outputStream.write(conteudo);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException("Arquivo não encontrado", e);
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }
    }
}
