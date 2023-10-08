public class Principal {

    public static void main(String[] args) {
        int idade = 10;

        try {
            // More em break-point (ctrl+shift+f8)
            if(idade < 18) {
                throw new IllegalArgumentException("Menor de idade");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

}