import java.io.File;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws IOException {


        File pasta1 = new File("/home/moises/Desktop/DEV/AlgaWorks/EspecialistaJava/28. Manipulando Arquivo API IO/28.02. Instanciando e criando arquivos e pastas com a classe File/docs");
        System.out.printf("Pasta 1 criada: %b%n", pasta1.mkdir());
        //pasta1.mkdir();

        File pasta2 = new File("/home/moises/Desktop/DEV/AlgaWorks/EspecialistaJava/28. Manipulando Arquivo API IO/28.02. Instanciando e criando arquivos e pastas com a classe File/fotos/viagem");
        System.out.printf("Pasta 2 criada: %b%n", pasta2.mkdirs());

        File arquivo1 = new File("C:\\temp\\contrato.txt");
        File arquivo2 = new File("/home/moises/Desktop/DEV/AlgaWorks/EspecialistaJava/28. Manipulando Arquivo API IO/28.02. Instanciando e criando arquivos e pastas com a classe File/docs/contrato.txt");

        File arquivo3 = new File("/home/moises/Desktop/DEV/AlgaWorks/EspecialistaJava/28. Manipulando Arquivo API IO/28.02. Instanciando e criando arquivos e pastas com a classe File/", "docs/contrato.txt");

        File arquivo4 = new File(pasta1, "contrato"); //Pega caminho do file

        System.out.printf("Arquivo 4 criado: %b%n", arquivo4.createNewFile());
        //arquivo4.createNewFile();// precisa lançar a exceção
    }

}
