public class Principal {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setNomeCliente("João da Silva");


        pedido.setStatus(Pedido.EMITIDO);
        pedido.setOrigem(Pedido.BALCAO);

        System.out.println(pedido.getStatus());
    }

}
