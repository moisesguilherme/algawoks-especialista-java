import java.io.*;

public class PrincipalBufferedRead {


    public static void main(String[] args)  {

        File arquivoOrigem = new File("docs/lista.txt");

        // Por padrão ele carrega 8k
        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivoOrigem))) {

            String linha = null;

            while((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        };

    }

}
