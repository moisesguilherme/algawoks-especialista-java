public class Principal {

    public static void main(String[] args) {

        NotaFiscal nf = new NotaFiscal(123, "Macbook Pro", 800);
        System.out.println(nf.getDescricaoCompleta());


        //nf.emitir();
        //System.out.println(nf.getDescricaoCompleta());

        nf.setStatus(StatusNota.EMITIDA);
        nf.cancelar(); // IllegalStateException
        System.out.println(nf.getDescricaoCompleta());


    }

}
