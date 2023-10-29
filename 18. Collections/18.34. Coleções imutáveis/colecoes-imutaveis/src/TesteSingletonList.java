import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TesteSingletonList {

    public static void main(String[] args) {
        List<Integer> numeros = Collections.singletonList(1);
        //System.out.println(numeros);


        // Copia de um arraylist
        List<Integer> ns = new ArrayList<>();
        ns.add(1);
        ns.add(2);
        ns.add(3);
        System.out.println(ns);
        List<Integer> copia = ns.stream().collect(Collectors.toList());

        ns.add(4);
        copia.add(4);
        System.out.println(copia);
    }

}

