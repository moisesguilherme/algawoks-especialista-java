import com.algaworks.sorteio.Cliente;
import com.algaworks.sorteio.GenericsExample;

public class Principal2 {

    public static void main(String[] args) {

        String str = GenericsExample.createInstance(String.class);
        str = "Olá essa string foi criada pelo método Generics";
        System.out.println(str instanceof  String);
        System.out.println("value:" + str);

        Cliente cliente = GenericsExample.createInstance(Cliente.class);
        cliente.setRazaoSocial("Cliente Teste LTDA");
        System.out.println(cliente instanceof  Cliente);
        System.out.println("value:" + cliente);

        Integer n = GenericsExample.createInstance(Integer.class);
        n = 10;
        System.out.println(n instanceof  Integer);
        System.out.println("value:" + n);

    }
}
