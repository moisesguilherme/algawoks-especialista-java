import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class DecodificarByteBuffer {




    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        buffer.put((byte) 79);
        buffer.put((byte) 108);
        buffer.put((byte) -61); // á
        buffer.put((byte) -95); // á UTF-8 (engloba diversos idiomas)


        //Converter em caracteres
        buffer.flip();
        //System.out.println(buffer.limit());

        //CharBuffer charBuffer = buffer.asCharBuffer();
        //System.out.println(charBuffer); //佬쎡
        Charset charSet = StandardCharsets.UTF_8;
        CharBuffer charBuffer = charSet.decode(buffer);
        System.out.println(charBuffer);

        // a -> 97
        // á -> [-61, -95]
        //System.out.println(Arrays.toString("á".getBytes()));
        ///System.out.println(Arrays.toString("Olá".getBytes(StandardCharsets.UTF_8))); //padrão UTF-8


    }


}
