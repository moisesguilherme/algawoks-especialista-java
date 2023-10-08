public class Principal {

    public static void main(String[] args) {
        try {
            // No Debug: Em main: btn direito e throw exception:
            // new RuntimeException("Erro")
            System.out.println("Teste");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

}