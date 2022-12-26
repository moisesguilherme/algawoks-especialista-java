public class Principal2 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        // cliente.idade = Integer.valueOf(20);
        // cliente.idade = Integer.valueOf("vinte");
        // cliente.idade = null;
        // cliente.idade = Integer.valueOf(20);
        // Consegue converter com string "25"
        cliente.idade = Integer.valueOf("25");

        System.out.printf("Idade: %d%n", cliente.idade);
    }

}
