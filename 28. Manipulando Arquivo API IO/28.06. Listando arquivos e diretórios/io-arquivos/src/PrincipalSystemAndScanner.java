import java.io.*;
import java.util.Scanner;

public class PrincipalSystemAndScanner {


    public static void main(String[] args) throws IOException {
        /*InputStream inputStream = System.in;
        //Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(inputStream);

        String linha = null;
        while(!(linha = scanner.nextLine()).equals("sair")) {
            System.out.println("Você digitou: " + linha);
        }
        System.out.println("Saiu!");
         */

        // Tem como usar o BufferedReader no lugar do inputStream

        /*
        InputStream inputStream = System.in;
        //Scanner scanner = new Scanner(System.in);
        BufferedReader leitor = new BufferedReader(new InputStreamReader(inputStream));

        String linha = null;
        while(!(linha = leitor.readLine()).equals("sair")) {
            System.out.println("Você digitou: " + linha);
        }
        System.out.println("Saiu!");
         */

        Scanner scanner = new Scanner(new FileInputStream("docs/lista.txt"));
        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }

}
