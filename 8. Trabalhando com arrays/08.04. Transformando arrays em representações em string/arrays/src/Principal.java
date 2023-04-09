import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {
        int[] notas = {8, 5, 4, 9, 10};

        // imprimindo o objeto: [I@4617c264: o i código de int.
        //System.out.println(notas);

        // Usando o método toString.
        String notasEmString = Arrays.toString(notas);
        System.out.println(notasEmString);
    }

}
