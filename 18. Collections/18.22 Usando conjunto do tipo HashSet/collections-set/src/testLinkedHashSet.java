import com.algaworks.crm.Contato;

import java.util.LinkedHashSet;
import java.util.Set;

public class testLinkedHashSet {

    public static void main(String[] args) {
        Set<Contato> contatos = new LinkedHashSet<>();

        // vai manter a ordem de insercão.
        System.out.println("---");
        contatos.add(new Contato("Maria", "maria@algaworks.com", 40));
        contatos.add(new Contato("Ana", "ana@algaworks.com", 30));
        contatos.add(new Contato("José", "jose@algaworks.com", 25));
        contatos.add(new Contato("Rosa", "rosa@algaworks.com", 50));
        contatos.add(new Contato("João", "joao@algaworks.com", 70));
        System.out.println("---");

        // aceita valor nulo, somente um pq o set não aceita elemento duplicados
        contatos.add(null);

        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }

}
