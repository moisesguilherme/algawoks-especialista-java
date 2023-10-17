import java.util.Iterator;

public class Sorteador implements Iterable<Integer>{

    @Override
    public Iterator<Integer> iterator() {
        System.out.println("RETORNANDO UM INTERATOR");
        return new SorteadorIterator();
    }
}