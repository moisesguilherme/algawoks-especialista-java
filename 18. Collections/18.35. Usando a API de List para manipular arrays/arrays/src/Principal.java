import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {

    public static void main(String[] args) {
        Integer[] numeros1 = {1, 2};
        numeros1[0] = 4;
        // O Array vai ser a fonte de dados
        List<Integer> numeros2 = Arrays.asList(numeros1); //Visualizando não é uma cópia

        //numeros2.set(1, 4); // Vai refletir no array também

        //System.out.println(Arrays.toString(numeros1));
        //System.out.println(numeros2);

        //numeros2.add(10); //Erro, não vai conseguir adicionar pq o array tem tamnho fixo

        for (int i = 0; i < numeros1.length; i++) {
            System.out.println(numeros1[i]);
        }


        for (int i = 0; i < numeros2.size(); i++) {
            System.out.println(numeros2.get(i));
        }

        // Copiar usando stream api
        List<Integer> copia = numeros2.stream().collect(Collectors.toList());
        copia.add(5);
        System.out.println(copia);

    }

}
