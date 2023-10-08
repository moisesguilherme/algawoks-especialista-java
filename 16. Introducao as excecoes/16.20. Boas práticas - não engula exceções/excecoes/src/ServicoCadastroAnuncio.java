import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ServicoCadastroAnuncio {

    public void cadastrar(String codigo, String descricao) {
        Path arquivo = Path.of("/home/moises/Desktop/DEV/AlgaWorks/EspecialistaJava/abc", codigo + ".txt");

        try {
            Files.writeString(arquivo, descricao);
        } catch (IOException e) {
            throw new CadastroAnuncioException("Erro na escrita do arquivo de anúncio...", e);

            // Engolir excecão // não ter nda auqi.
            // É melhor usar alguma biblioteca de loggin para fazer isso
            //System.out.println(">>> erro escrevendo arquivo. Ignorando...");
            //e.printStackTrace();
        }
    }

}