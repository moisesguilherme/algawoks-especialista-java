import com.algaworks.sorteio.Conversor;

public class Principal2 {

    public static void main(String[] args) {

        //Test String
        String nome = "José";
        String testeComString = Conversor.<String>tipo(nome);
        System.out.println(testeComString);

        //Test Number
        Integer number = 2;
        Integer testeComInteger = Conversor.<Integer>tipo(number);
        System.out.println(testeComInteger);


    }
}
