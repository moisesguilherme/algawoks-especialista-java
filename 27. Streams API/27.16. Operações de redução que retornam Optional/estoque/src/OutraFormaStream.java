import javax.sound.midi.Soundbank;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OutraFormaStream {

    public static void main(String[] args) {

        /*String[] nomes = { "Maria", "Sebastiaão", "João"};
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
        */

        /*
        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        Stream<Integer> stream2 = Stream.of(9, 8, 7);

        Stream.concat(stream1, stream2)
                .filter(x -> x%2 == 0) //somente números pares
                .forEach(System.out::print);
        */

        /*
        IntStream.range(1, 10)
                .forEach(System.out::print); // 123456789 até nove
        */

        /*
        IntStream.rangeClosed(1, 10)
                .skip(2) //salta 2 -> 345678910
                .forEach(System.out::print);
         */

        Random random = new Random();
        int[] contador = {0};

        Stream.generate(() -> random.nextInt(99) + 1)
                .peek(System.out::println)
                .filter(x -> x%2 == 0)
                .distinct()
                .limit(10)
                .forEach( numero -> {
                    contador[0]++;
                    System.out.println("Número " + contador[0] + ": " + numero);
                });

    }



}
