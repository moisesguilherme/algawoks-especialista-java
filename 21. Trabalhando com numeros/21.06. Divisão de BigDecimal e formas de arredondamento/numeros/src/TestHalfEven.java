import java.math.BigDecimal;
import java.math.RoundingMode;

public class TestHalfEven {

    public static void main(String[] args) {
        BigDecimal valor = new BigDecimal("2.535");
        BigDecimal d = new BigDecimal("1.0");

        BigDecimal x = valor.divide(d, 2, RoundingMode.HALF_EVEN);

        // 2.524 = 2.52 (HALF EVEN)
        // 2.526 - 2.53
        // 2.525 = 2.53 (numero a esquerda (5) impar arredonda para cima)
        // 2.535 = 2.54
        //System.out.println(x);

        BigDecimal bd = new BigDecimal("2.639").divide(d,  2, RoundingMode.HALF_EVEN);
        System.out.println(bd);

        // 2.728 = 2.73


        /*
         Modo de arredondamento para arredondar em direção ao "vizinho mais próximo"...
         Comporta-se como RoundingMode.HALF_UP se o dígito à esquerda da fração descartada for ímpar;
         se comporta como RoundingMode.HALF_DOWN se for par.

         Observe que este é o modo de arredondamento que minimiza estatisticamente o erro cumulativo
         quando aplicado repetidamente em uma sequência de cálculos.

         Às vezes é conhecido como "arredondamento do banqueiro" e é usado principalmente nos EUA..

         o número fracionado é 2.525, o número imediatamente a esquerda do último dígito (5)
         é par, logo o arredondamento é "para baixo", imprimindo o resultado 2.52.
         Se realizar o teste com a fração 2.535, verás que o arredondamento será feito "para cima",
         pois o número imediatamente a esquerda do último dígito (5) é ímpar, ou seja, 3.
         Neste caso, o resultado passa a ser 2.54.
         */




    }

}
