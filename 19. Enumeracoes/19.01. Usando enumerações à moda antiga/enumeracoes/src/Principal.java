public class Principal {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setNomeCliente("João da Silva");

        System.out.println(StatusPedido.EMITIDO.ordinal());
        System.out.println(StatusPedido.EMITIDO.name());

        System.out.println("\n ------------------------ \n");

        for (StatusPedido status : StatusPedido.values()) {
            System.out.printf("%d - %s%n", status.ordinal(), status.name());
        }

        System.out.println("\n ------------------------ \n");
        String textoStatus = "CANCELADO";
        StatusPedido status = StatusPedido.valueOf(textoStatus);
        System.out.println(status.ordinal() + " - " + status.name());

        // com o value (número)
        int numero = 3;
        //StatusPedido status = (StatusPedido) numero //Não funciona
        StatusPedido status2 = StatusPedido.values()[numero];
        System.out.println(status2.ordinal() + " - " + status2.name());

    }

}
