import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {

    public static void main(String[] args) {
        Path arquivo = Path.of("/home/moises/Desktop/DEV/AlgaWorks/EspecialistaJava/teste2.txt");

        try {
            BufferedReader reader = Files.newBufferedReader(arquivo);
            System.out.println(reader.readLine()); // pode lancar uma IOException
            // se for executado vai para o catch, e o reader.close() nao vai ser executado
            reader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }

}