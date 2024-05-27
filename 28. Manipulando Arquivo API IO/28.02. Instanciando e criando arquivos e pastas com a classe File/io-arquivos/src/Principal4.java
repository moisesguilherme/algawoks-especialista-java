import java.io.File;
import java.io.IOException;
import java.time.Instant;

public class Principal4 {

    public static void main(String[] args) throws IOException {

        //File pasta1 = new File("docs");
        //File arquivo1 = new File(pasta1, ".contrato.txt");
        File pasta1 = new File("/home/english/Desktop");
        File arquivo1 = new File(pasta1, "folha.pdf");

        //File arquivo1 = new File(pasta1, "contrato.txt").getCanonicalFile();

        System.out.printf("Nome: %s%n", arquivo1.getName()); //Nome: contrato.txt
        System.out.printf("Diretório pai: %s%n", arquivo1.getParent()); //Diretório pai: docs

        System.out.printf("Arquivo: %b%n", arquivo1.isFile());
        System.out.printf("Pasta: %b%n", pasta1.isDirectory());

        System.out.printf("Existe: %b%n", arquivo1.exists());
        System.out.printf("Oculto: %b%n", arquivo1.isHidden());

        System.out.printf("Última modificação: %b%n", arquivo1.lastModified());
        System.out.printf("Última modificação: %s%n", Instant.ofEpochMilli(arquivo1.lastModified()));
        System.out.printf("Tamanho: %d%n", arquivo1.length());

        System.out.printf("Pode executar: %b%n", arquivo1.canExecute());
        System.out.printf("Pode ler: %b%n", arquivo1.canRead());
        System.out.printf("Pode escrever: %b%n", arquivo1.canWrite());

    }

}
