import java.util.Iterator;

public class Principal {

    public static void main(String[] args) {
        Sorteador sorteador = new Sorteador();
        Iterator<Integer> sorteadorIterator = sorteador.iterator();

        while (sorteadorIterator.hasNext()){
            System.out.println(sorteadorIterator.next());
        }

    }

}
