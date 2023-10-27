import java.util.*;

public class Principal {

    public static void main(String[] args) {
        Estado mg = new Estado("MG", "Minas Gerais");
        Estado ce = new Estado("CE", "Ceará");
        Estado ro = new Estado("RO", "Rondônia");
        Estado sp = new Estado("SP", "São Paulo");

        Cidade saoPaulo = new Cidade(3550308, "São Paulo", 12_396_372);
        Cidade beloHorizonte = new Cidade(3106200, "Belo Horizonte", 2_530_701);
        Cidade fortaleza = new Cidade(2304401, "Fortaleza", 2_703_391);
        Cidade portoVelho = new Cidade(1100205, "Porto Velho", 548_952);

        // TODO Performance é mais importante (não garante a ordem das chaves)
        //Map<Estado, Cidade> capitais = new HashMap<>();

        // TODO Performance é importante, mas precisa manter ordem de inserção das chaves
        //Map<Estado, Cidade> capitais = new LinkedHashMap<>();

        // TODO Performance é menos importante e precisa manter a ordem natural das chaves
        Map<Estado, Cidade> capitais = new TreeMap<>();

        capitais.put(sp, saoPaulo);
        capitais.put(mg, beloHorizonte);
        capitais.put(ce, fortaleza);
        capitais.put(ro, portoVelho);

        // TODO Iteração nas entradas do mapa (chave/valor)
        //System.out.println(capitais);

        // Chaves
        /*Set<Estado> chaves = capitais.keySet();
        for (Estado estado : chaves) {
            System.out.println(estado);
        }*/

        // Values
        /*Collection<Cidade> cidadeCollections = capitais.values();
        for (Cidade cidadeCollection : cidadeCollections) {
            System.out.println(cidadeCollection);
        }*/

        // Chave e valor
        /*for (Estado estado : capitais.keySet()) {
            Cidade capital = capitais.get(estado);
            System.out.printf("%s-%s - Capital: %s IBGE: %s Habitantes: %s %n",
                    estado.getNome(), estado.getSigla(),
                    capital.getNome(), capital.getCodigoIbge(),
                    capital.getTotalHabitantes() );
        }*/

        for (var entry : capitais.entrySet()) {
            System.out.printf("%s-%s - Capital: %s IBGE: %s Habitantes: %d %n",
                    entry.getKey().getNome(), entry.getKey().getSigla(),
                    entry.getValue().getNome(), entry.getValue().getCodigoIbge(),
                    entry.getValue().getTotalHabitantes() );
        }

    }

}
