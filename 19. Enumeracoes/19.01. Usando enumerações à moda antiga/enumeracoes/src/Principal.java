public class Principal {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setNomeCliente("João da Silva");

        // Não tem consistência
        //pedido.setStatus(Pedido.EMITIDO);
        pedido.setStatus(100);

        System.out.println(pedido.getStatus());
    }

}
