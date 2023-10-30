public class Principal {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setNomeCliente("João da Silva");


        pedido.setStatus(Pedido.STATUS_EMITIDO);
        pedido.setOrigem(Pedido.ORIGEM_BALCAO);
        //Se inverter colocar status no pedido vai gerar o erro
        //pedido.setOrigem(Pedido.STATUS_EMITIDO);

        System.out.println(pedido.getStatus());
        System.out.println(pedido.getOrigem());
    }

}
