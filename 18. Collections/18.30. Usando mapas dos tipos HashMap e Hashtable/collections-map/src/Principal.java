import com.algaworks.detran.Carro;
import com.algaworks.detran.Proprietario;

import java.util.*;

public class Principal {

    public static void main(String[] args) {
        Proprietario maria = new Proprietario("Maria", "05577788899");
        Proprietario ana = new Proprietario("Ana", "33344488811");
        Proprietario jose = new Proprietario("José", "09988877766");
        Proprietario joao = new Proprietario("João", "22233344455");

        Carro bmw = new Carro("ALG1A23", "BMW X3");
        Carro honda = new Carro("WOR9K87", "Honda HR-V");
        Carro ford = new Carro("JAV5A67", "Ford Ka");
        Carro porsche = new Carro("EJA0V44", "Porsche 911");

        // Não pode colocar tipo primitivo
        // Carro precisa ter equals e hashcode
        Map<Carro, Proprietario> proprietarios = new HashMap<>();
        proprietarios.put(bmw, maria);
        proprietarios.put(honda, ana);
        proprietarios.put(ford, jose);
        proprietarios.put(porsche, maria);

        //System.out.println(proprietarios); //toString em carro e proprietário

        //System.out.println(proprietarios.get(ford));

        // Pode ser por new, pois tem o equals e hashcode implementado
        //System.out.println(proprietarios.get(new Carro("JAV5A67", "Ford Ka 2")));
        
        // Todas as chaves adicionadas no mapa
        // HashMap não garante a ordem
        /*Set<Carro> chaves = proprietarios.keySet();
        for (Carro carro : chaves) {
            System.out.println(carro);
        }*/

        // Conteúdo (valores) da collection
        Collection<Proprietario> proprietarioCollection = proprietarios.values();
        for (Proprietario proprietario : proprietarioCollection) {
            System.out.println(proprietario);
        }
        
        
    }

}