import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class UsandoBuffer {

    public static void main(String[] args) {
        //Buffer buffer = ByteBuffer.allocate(1024); // 1 kb
        ByteBuffer buffer = ByteBuffer.allocate(1024); // 1 kb

        System.out.println(buffer.position());
        buffer.put( (byte) 10);
        System.out.println(buffer.position());

        buffer.put( (byte) 20);
        System.out.println(buffer.position());

        // volta posição 0
        // e tmb altera o limit
        buffer.flip();

        buffer.put((byte) 30);
        buffer.put((byte) 40);

        buffer.clear();

        System.out.println(Arrays.toString(buffer.array()));

        System.out.println();

        System.out.println(buffer.limit());
    }

}
