public class Principal {

    public static void main(String[] args) {
        String nome1 = "João";
        String nome2 = "João";

        // o hascode é igual
        System.out.println(nome1.hashCode());
        System.out.println(nome2.hashCode());

        //String nome2 = new String("João");

        //System.out.println(nome1);
        //System.out.println(nome2);

        //System.out.println(nome1 == nome2); //False (referência endereco de memória)

        System.out.println(nome1.equals(nome2));

    }

}
