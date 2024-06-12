import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class UsandoApiClassicaNIO {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("docs/poema.txt");
        
        try(BufferedReader reader = Files.newBufferedReader(path)) {
            reader.lines()
                    .forEach(System.out::println); // Ler linha a linha
        }

        //ByteBuffer buffer = ByteBuffer.allocate(40);
/*      //  try (ByteChannel channel = Files.newByteChannel(path, StandardOpenOption.READ)) {
         try(var inputStream = new FileInputStream(path.toFile())) {
            var channel = inputStream.getChannel(); // Com a api clássica NIO, consegue pegar um channel

            while (channel.read(buffer) > 0) {
                buffer.flip();
                CharBuffer charBuffer = StandardCharsets.UTF_8.decode(buffer);
                System.out.print(charBuffer);
                buffer.clear();
            }
        }*/
    }

}
