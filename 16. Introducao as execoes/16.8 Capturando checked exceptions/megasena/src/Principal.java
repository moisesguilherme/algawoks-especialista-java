import java.util.Iterator;

public class Principal {

    public static void main(String[] args) {

        Sorteador sorteador = new Sorteador();
        //Iterator<Integer> sorteadorIterator = sorteador.iterator();

        for (Integer i: sorteador) {
            System.out.println(i);
        }

        /*while (sorteadorIterator.hasNext()){
            System.out.println(sorteadorIterator.next());
        }*/

        //System.out.println(sorteadorIterator.next()); //lancar excecão

    }

}
