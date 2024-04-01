package exemplo2;

import java.util.ArrayList;
import java.util.List;

public class Principal {


    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", 42);
        cliente.setStatus(Cliente.Status.BLOQUEADO);
    }


}
