import java.io.*;

public class PrincipalFileInputStream {

    public static void main(String[] args) {
        File arquivoOrigem = new File("docs/contrato.txt");
        //InputStream inputStream = null;
        //Declarar no try
        // pode colocar mais de um new
        try (InputStream inputStream = new FileInputStream(arquivoOrigem);
             InputStream inputStream2 = new FileInputStream(arquivoOrigem)) {
            //inputStream = new FileInputStream(arquivoOrigem);
            int conteudo;

            while ((conteudo = inputStream.read()) != -1) {
                System.out.print((char) conteudo); //problema com acento exemplo: ú
            }

            //System.out.println(inputStream.read()); //69
            //System.out.println(inputStream.read());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            /// Se der problema no read
            throw new RuntimeException(e);
        }/* finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println("Não foi possível fechar fluxo com arquivo");
                    // se não fechar o fluxo, não tem muito oq fazer...
                    //throw new RuntimeException(e);
                }
            }
        }*/
        // Classe AutoCloseble -> usada para try-with-resources
    }
}
