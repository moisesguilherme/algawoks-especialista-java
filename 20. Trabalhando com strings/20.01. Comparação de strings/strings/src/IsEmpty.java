public class IsEmpty {

    public static void main(String[] args) {
        String nome1 = "";

        // string vazia
        System.out.println(nome1.length() == 0); //true

        //no Java 6 temos o isEmpty
        System.out.println(nome1.isEmpty());
    }


}
