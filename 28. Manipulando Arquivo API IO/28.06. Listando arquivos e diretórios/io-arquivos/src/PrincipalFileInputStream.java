import java.io.*;

public class PrincipalFileInputStream {

    public static void main(String[] args) throws FileNotFoundException {
        File arquivoOrigem = new File("docs/contrato.txt");

        // com java 9 consegue fazer com final.
        final InputStream inputStream = new FileInputStream(arquivoOrigem);
        final InputStream inputStream2 = new FileInputStream(arquivoOrigem);

        // try-with-resource (ele vai ser fechado no final)
        // Uma boa prática, sempre usar.
        try (inputStream; inputStream2) {
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
