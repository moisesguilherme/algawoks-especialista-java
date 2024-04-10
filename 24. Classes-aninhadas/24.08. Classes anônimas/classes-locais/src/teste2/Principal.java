package teste2;

public class Principal {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        // Classe anônima que herda cliente
        Cliente cliente1 = new Cliente("Teste") {

            public void teste(){
                System.out.println("imprime");
            }

        };

        ClientePJ cliente2 = new ClientePJ();

        System.out.println(cliente.nome);
        System.out.println(cliente1.nome);
        System.out.println(cliente2.nome);

    }


}
