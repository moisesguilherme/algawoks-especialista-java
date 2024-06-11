import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class LendoByteChannel {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("docs/poema.txt");
        //Lendo arquivos com buffers menores

        // melhor estratégia ler linha a linha com /n
        ByteBuffer buffer = ByteBuffer.allocate(3);

        try (ByteChannel channel = Files.newByteChannel(path, StandardOpenOption.READ)) {
            while (channel.read(buffer) > 0) {
                buffer.flip();
                //System.out.println(buffer.limit());
                CharBuffer charBuffer = StandardCharsets.UTF_8.decode(buffer);
                System.out.print(charBuffer);

                buffer.clear(); // define o limite do buffer para 20 bytes (capacidade)
                //System.out.println(buffer.position());
            }

        }

    }

}
