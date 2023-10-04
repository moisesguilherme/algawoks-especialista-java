import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {
    public static void main(String[] args) {
        Path arquivo = Path.of("/home/moises/Desktop/DEV/AlgaWorks/EspecialistaJava/a/teste.txt");

        try {
            //Path arquivo = Path.of("/home/moises/Desktop/DEV/AlgaWorks/EspecialistaJava/a/teste.txt");
            Files.createFile(arquivo);
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo: " + e.getMessage());
            e.printStackTrace();
        }

        // Escopo da variável fica no bloco try
        // Files.createFile(arquivo); // Não consegue usar aqui

    }
}