public class ValidadorEmail {
    // nome_do_usuario@dominio.sufixododominio
    // regras para nome:
    //   letra e digitos e não caracter especiais - ok
    //   _ - .
    //   nome com letra maiúscula M
    //   domínio
    //    _ (não) ou Maiúsculo não
    //   sufixo domínio
    //    pode ter 2 caracteres, não pode 1
    //    somente letras

    // dividir @ .

    //TODO Refatorar (quando terminar o módulo)

    public static boolean validar(String email) {
        //System.out.println("Log: " + email);

        if(email.isBlank() || email.isEmpty()) return false;

        int arrobaIndex = email.indexOf('@');

        if(arrobaIndex == -1) return false;

        String nome = email.substring(0, arrobaIndex );
        String dominio = email.substring(arrobaIndex+1, email.length());

        int pontoIndex = dominio.lastIndexOf(".");

        if(pontoIndex == -1) return false;

        String sufixo = dominio.substring(pontoIndex+1, dominio.length());
        dominio = dominio.substring(0, pontoIndex);

        if(nome.length() == 0 || dominio.length() == 0 ||
           sufixo.length() == 0 || sufixo.length() > 3) return false;

        boolean resultNome = possuiEstesCaracteres(nome, " ", "!", "@", "#","$","%","^","&","*","(",")","+","=",",",";","'",",","/","<",">","/" );
        boolean resultDominio = possuiEstesCaracteres(dominio, " ",  "!", "@", "#","$","%","^","&","*","(",")","+","=",",",";","'",",","/","<",">","/" );
        boolean resultSufixo = possuiEstesCaracteres(sufixo, " ", "0","1", "2", "3", "4", "5", "6", "7", "8", "9", "!", "@", "#","$","%","^","&","*","(",")","+","=",",",";","'",",","/","<",">","/" );

        return !(resultNome || resultDominio || resultSufixo
           || possuiMaiusculo(dominio)
           || possuiMaiusculo(sufixo));

    }

    public static boolean possuiEstesCaracteres(String palavra, String... caracteres){
        for (String caractere : caracteres) {
            if(palavra.indexOf(caractere) != -1 )
                return true;
        }
        return false;
    }

    public static boolean possuiMaiusculo(String palavra){
        for (int i = 0; i < palavra.length(); i++) {
            String letraAtual = palavra.substring(i, i+1);
            String letraMaiuscula = palavra.substring(i, i+1);
            Character numero = letraAtual.charAt(0);
            // TODO: Colocar outra funcão ver ser é caracter
            if(!Character.isDigit(numero) && !letraAtual.equals(".") && !letraAtual.equals("-")) {
                letraMaiuscula = letraMaiuscula.toUpperCase();
                if(letraAtual.equals(letraMaiuscula))
                    return true;
            };
        }
        return false;
    };

}
