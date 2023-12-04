public class Strip {

    public static void main(String[] args) {
        String nome = "\n      Pedro       ";

        //System.out.println(nome);

        // Apartir do Java 11
        System.out.println(">" + nome + "<");

        //System.out.println(nome.trim()); // tem alguns espacos que ele não remove
        //System.out.println(nome.strip()); //melhor

        //System.out.println(nome.stripLeading()); // remove a esquerda
        System.out.println(nome.stripTrailing()); // remove a direita

    }

}
