package exemplo.codigoDDD;

public class testDDD {
    public static void main(String[] args) {

        System.out.println("Item  -  Código  - Descricão");

        for(CodigoDDD codigos: CodigoDDD.values()) {
            System.out.println(codigos.name() + "    -   " + codigos.getCodigo() + "     - " + codigos.getDescricao());
        }
    }
}
