public class isBlank {
    public static void main(String[] args) {
        String nome1 = "     ";
        System.out.println(nome1.isEmpty()); //false

        System.out.println(nome1.isBlank()); //true


    }
}
