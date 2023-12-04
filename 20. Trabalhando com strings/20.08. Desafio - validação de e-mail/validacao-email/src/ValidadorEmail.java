public class ValidadorEmail {

    // nome_do_usuario@dominio.sufixododominio
    // regras para nome:
    //   letra e digitos e não caracter especiais
    //   _ - .
    //   nome com letra maiúscula M
    //   domínio
    //    _ (não) ou Maiúsculo não
    //   sufixo domínio
    //    pode ter 2 caracteres, não pode 1
    //    somente letras

    // dividir @ .

    public static boolean validar(String email) {

        String nome = email.substring(0, email.indexOf("@"));
        System.out.println(nome);
        return true;
    }

}
