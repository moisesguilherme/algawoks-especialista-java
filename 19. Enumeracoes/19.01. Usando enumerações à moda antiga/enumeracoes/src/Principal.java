public class Principal {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setNomeCliente("João da Silva");

        // altera estatus para emitido
        // forma ruim
        pedido.setStatus(1);


    }

}
