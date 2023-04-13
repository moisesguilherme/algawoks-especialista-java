import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {
        int[] numerosJogoAtual = {25, 11, 8, 46, 37, 14, 55};
        int[] numerosNovoJovo = new int[numerosJogoAtual.length -1];

        int indiceExclusao = 2;

        // [25, 11, 8, 46, 37, 14, 55]
        // [0, 0, 0, 0, 0, 0]

        // Não usa o Arrays.copyOf e sim o System.arraycopy
        System.arraycopy(numerosJogoAtual, 0,
                numerosNovoJovo, 0, indiceExclusao);

        System.arraycopy(numerosJogoAtual, indiceExclusao+1,
                numerosNovoJovo, indiceExclusao, numerosNovoJovo.length - indiceExclusao);

        System.out.println(Arrays.toString(numerosJogoAtual));
        System.out.println(Arrays.toString(numerosNovoJovo));

    }

}
