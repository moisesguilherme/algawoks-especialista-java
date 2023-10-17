import java.util.Iterator;

// Essa classe realmente vai iterar com algo, pode ser uma lista
public class SorteadorIterator implements Iterator<Integer>{

    int[] numeros = {1,2,3};
    int posicaoAtual = 0;

    @Override
    public boolean hasNext() {
        return posicaoAtual < numeros.length;
    }

    @Override
    public Integer next() {
        return numeros[posicaoAtual++];
    }

}