import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

// Essa classe realmente vai iterar com algo, pode ser uma lista
public class SorteadorIterator implements Iterator<Integer>{

    public static final Random RANDOM = new Random();
    private int quantidadeSortiada;


    public SorteadorIterator() {
        System.out.println(RANDOM);
    }

    @Override
    public boolean hasNext() {
        return quantidadeSortiada < 6;
    }

    @Override
    public Integer next() {
        if(!hasNext())  {
            throw new NoSuchElementException("Todos os números já foram sorteados");
        }

        quantidadeSortiada++;
        return RANDOM.nextInt(60);
    }

}