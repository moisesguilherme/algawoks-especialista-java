public class Principal {

    public static void main(String[] args) {
        NotaFiscal nf = new NotaFiscal(123, "Macbook Pro", 18_000);
        System.out.println(nf.getDescricaoCompleta());

        nf.setStatus(StatusNota.STATUS_CANCELADA);
        nf.emitir();
        System.out.println(nf.getDescricaoCompleta());

        //nf.cancelar(); // IllegalStateException
        //System.out.println(nf.getDescricaoCompleta());


    }

}
