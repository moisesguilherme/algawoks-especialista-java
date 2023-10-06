import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {

    public static void main(String[] args) throws IOException {
        Path arquivo = Path.of("/home/moises/Desktop/DEV/AlgaWorks/EspecialistaJava/teste3.txt");
        BufferedReader reader = null;

        try {
            reader = Files.newBufferedReader(arquivo);
            System.out.println(reader.readLine()); // pode lancar uma IOException
            // se for executado vai para o catch, e o reader.close() nao vai ser executado

        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        } finally {
            // uma excecao não pode estorar dentro do finally
            // se isso acontecer ela vai substituir uma excecao anterior
            System.out.println("DEBUG: Finally");
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("Erro fechando leitor de arquivo");
            }
        }
    }

}