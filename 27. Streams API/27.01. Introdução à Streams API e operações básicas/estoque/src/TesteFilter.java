import java.util.Arrays;
import java.util.stream.Stream;

public class TesteFilter {

    public static void main(String[] args) {

        Integer[] lista1 = new Integer[] {1,2,3};
        Integer[] lista2 = new Integer[] {2,3,4};

        Integer[] diferenca = Stream.concat(Arrays.stream(lista1), Arrays.stream(lista2))
                .filter(n -> !(Arrays.asList(lista1).contains(n) && Arrays.asList(lista2).contains(n)))
                .toArray(Integer[]::new);


        for (Integer i : diferenca) {
            System.out.println(i);
        }

    }
}
