import java.io.File;
import java.io.IOException;

public class Principal3 {

    public static void main(String[] args)  {

        //File pasta1 = new File("docs");
        //System.out.println(pasta1.getAbsoluteFile());
        //System.out.println(pasta1.getCanonicalFile());

        File pasta2 = new File("documentos");
        File arquivo1 = new File(pasta2, "contrato.txt");
        //System.out.println(pasta1.renameTo(pasta2));
        // Linguagem Java sempre presa pela retrocompatibilidade
        // Por isso essa api continua retornando true ou false.


        System.out.println(pasta2.delete());
        //System.out.println(arquivo1.delete());
    }

}
