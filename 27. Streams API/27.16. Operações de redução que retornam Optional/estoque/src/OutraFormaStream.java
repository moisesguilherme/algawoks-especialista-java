import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OutraFormaStream {

    public static void main(String[] args) {

        String[] nomes = { "Maria", "Sebastiaão", "João"};
        Arrays.stream(nomes)
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);


        Stream.iterate(new BigDecimal("1000"),
                 valor -> valor.compareTo(BigDecimal.ZERO) >= 0,
                 valor -> valor.subtract(new BigDecimal("10")))
                .forEach(System.out::println);

        Stream<Integer> stream = Stream.empty(); // Criar um stream vazio

        Stream.of(1, 2, 3)
                .forEach(System.out::println);

        int total = IntStream.of(1,2,3)
                .sum();

        System.out.println(total);
    }
}
