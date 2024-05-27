import java.io.File;
import java.io.IOException;

public class Principal2 {

    public static void main(String[] args) throws IOException {

        File arquivo1 = new File("/home/moises/Desktop/DEV/AlgaWorks/EspecialistaJava/28. Manipulando Arquivo API IO/28.02. Instanciando e criando arquivos e pastas com a classe File/docs/contrato.txt");
        arquivo1.createNewFile();
        System.out.println(arquivo1);
        System.out.println("----");

        /*
        File arquivo2 = new File("docs/contrato.txt");
        System.out.println(arquivo2);
        System.out.println(arquivo2.getAbsoluteFile());
        System.out.println("----");

        File arquivo3 = new File("../docs/contrato.txt");
        System.out.println(arquivo3);
        System.out.println(arquivo3.getAbsoluteFile());
        System.out.println(arquivo3.getCanonicalFile()); // agora ele volta ../ "resolve o diretório"
         */



    }

}
