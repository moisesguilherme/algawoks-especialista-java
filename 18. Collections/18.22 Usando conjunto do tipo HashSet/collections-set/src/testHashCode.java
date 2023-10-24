import com.algaworks.crm.Contato;
import com.algaworks.crm.IdadeContatoComparator;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class testHashCode{

    public static void main(String... args) {
        // Com o compartator vai ordernar pela idade, não vai usar o compareTo
        // na classe Contato que implementa Comparable
        Set<Contato> contatos = new TreeSet<>(new IdadeContatoComparator());

        System.out.println("---");
        contatos.add(new Contato("Maria", "maria@algaworks.com", 40));
        contatos.add(new Contato("Ana", "ana@algaworks.com", 30));
        contatos.add(new Contato("José", "jose@algaworks.com", 25));
        contatos.add(new Contato("Rosa", "rosa@algaworks.com", 50));
        contatos.add(new Contato("João", "joao@algaworks.com", 70));
        System.out.println("---");

        // TreeSet não aceita adicionar null
        //contatos.add(null);

        // contatos.add(new Contato("Ana Silva", "ana@algaworks.com", 10));

        // Ordem alfabética com o email
        for (Contato contato : contatos) {
            System.out.println(contato);
        }


    }


}
