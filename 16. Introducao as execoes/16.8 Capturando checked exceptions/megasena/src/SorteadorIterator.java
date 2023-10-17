import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

// Essa classe realmente vai iterar com algo, pode ser uma lista
public class SorteadorIterator implements Iterator<Integer>{

    private static final Random RANDOM = new Random();
    private int quantidadeSortada;

    @Override
    public boolean hasNext() {
        return quantidadeSortada < 6;
    }

    @Override
    public Integer next() {
        if(!hasNext())  {
            throw new NoSuchElementException("Todos os números já foram sorteados");
        }

        quantidadeSortada++;
        return RANDOM.nextInt(60);
    }

}