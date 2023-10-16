import com.algaworks.sorteio.Cliente;
import com.algaworks.sorteio.ObjectFactory;
import com.algaworks.sorteio.SomeContainer;

public class Principal2 {

    public static void main(String[] args) {

        //Test String
        /*String nome = "José";
        String testeComString = Conversor.<String>tipo(nome);
        System.out.println(testeComString);

        //Test Number
        Integer number = 2;
        Integer testeComInteger = Conversor.<Integer>tipo(number);
        System.out.println(testeComInteger);
        */
        //Retornando Integer
        Integer typeInteger = 2;
        Integer n = (Integer) ObjectFactory.<Integer>tipo(Integer.class);
        System.out.println(n instanceof  Integer);
        System.out.println("value:" + n);

        //SomeContainer<Integer> sc = new SomeContainer<>(Integer::new);

        //Retornando String
        /*
        String typeString = "Teste";
        String s = (String) ObjectFactory.<String>tipo(typeString);
        System.out.println(s instanceof  String);
        System.out.println("value:" + s);

        //Retornando Cliente
        Cliente typeCliente = new Cliente("Supermercado Pague e Leve", 2_000_000);
        Cliente c = (Cliente) ObjectFactory.<Cliente>tipo(typeCliente);
        System.out.println(c instanceof  Cliente);
        System.out.println("value:" + c);
         */
    }
}
