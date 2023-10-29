import java.util.ArrayList;
import java.util.List;

public class TesteCopyOf {

    public static void main(String[] args) {
        List<Integer> numeros1 = new ArrayList<>();
        numeros1.add(1);
        numeros1.add(2);

        // Java 10 - api
        // Gera uma cópia imutável
        List<Integer> numeros2 = List.copyOf(numeros1);
        // Erro ImmutableCollections
        //numeros2.add(3);
        numeros1.add(4); //Não vai aparecer na cópia do numeros2


        System.out.println(numeros2);
    }

}
