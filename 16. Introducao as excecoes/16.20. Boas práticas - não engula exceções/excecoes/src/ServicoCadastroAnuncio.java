import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ServicoCadastroAnuncio {

    public void cadastrar(String codigo, String descricao) {
        Path arquivo = Path.of("/home/moises/Desktop/DEV/AlgaWorks/EspecialistaJava/abc", codigo + ".txt");

        try {
            Files.writeString(arquivo, descricao);
        } catch (IOException e) {
            System.out.println(">>> erro");
        }
    }

}