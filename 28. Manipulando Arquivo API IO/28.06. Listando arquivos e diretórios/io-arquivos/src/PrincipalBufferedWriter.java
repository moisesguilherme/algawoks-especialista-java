import java.io.*;

public class PrincipalBufferedWriter {


    public static void main(String[] args)  {

        File arquivoOrigem = new File("docs/lista.txt");
        File arquivoDestino = new File("docs/saida.txt");

        // Por padrão ele carrega 8k
        try (Reader leitor = new FileReader(arquivoOrigem);
            Writer escritor = new FileWriter(arquivoDestino)) {

            int conteudo;
            while((conteudo = leitor.read()) != -1) { //caracter por caracter
                escritor.write(conteudo);
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        };

    }

}
