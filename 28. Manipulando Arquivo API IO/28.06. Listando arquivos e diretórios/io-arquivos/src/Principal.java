import java.io.File;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws IOException {
        File pasta = new File("docs").getCanonicalFile();
        //File pasta = new File("/home/moises/Desktop/DEV/AlgaWorks/EspecialistaJava/28. Manipulando Arquivo API IO/28.06. Listando arquivos e diretórios/io-arquivos/docs");
        System.out.println(pasta.getCanonicalFile());

        //File[] arquivos = pasta.listFiles();
        //File[] arquivos = pasta.listFiles(f -> f.isFile());
        //File[] arquivos = pasta.listFiles(File::isFile); //Method reference

        //File[] arquivos = pasta.listFiles(File::isDirectory);
        //File[] arquivos = pasta.listFiles(f -> f.getName().startsWith("c"));
        File[] arquivos = pasta.listFiles((dir, nome) -> nome.startsWith("c"));

        System.out.println(arquivos);

        if(arquivos != null) {
            for(File arquivo :  arquivos){
                System.out.println(arquivo.getName());
            }
        }

    }

}
