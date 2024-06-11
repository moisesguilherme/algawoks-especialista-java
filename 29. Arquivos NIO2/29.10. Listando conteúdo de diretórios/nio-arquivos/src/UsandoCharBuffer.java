import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.Arrays;

public class UsandoCharBuffer {

    public static void main(String[] args) {

        // 1000 caracteres, não é byte, pois tem caracter pode ter mais de um byte.
        CharBuffer charBuffer = CharBuffer.allocate(1000);

        charBuffer.put('O');
        charBuffer.put('l');
        charBuffer.put('á');

        // precisa chamar o flip, para zerar a posiçãso
        charBuffer.flip();

        //System.out.println(Arrays.toString(charBuffer.array()));

        charBuffer.chars()
                .forEach(c -> System.out.print( (char) c + " "));


        System.out.println(charBuffer);
    }

}
