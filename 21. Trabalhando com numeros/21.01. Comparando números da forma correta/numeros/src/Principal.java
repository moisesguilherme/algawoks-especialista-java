public class Principal {

    public static void main(String[] args) {
        int x = 128;
        int y = 128;

        // wrapper tem interna em cache, memória heap
        // java 5 -> para melhorar performance
        // -128 ate 127 (integerCache) pega do cache e reutiliza ele
        Integer a = 128; //127
        Integer b = 128; //127 -> com 127 ele fica igual (endereco de memória)

        // Outros tipos de wrapper que tb faz tipo de cache
        //Long i = 10L;
        //Short;
        //Byte;
        //Character;
        //Boolean;

        //Não tem cache
        //Double e Float

        System.out.println(x == y);
        System.out.println(a == b);

        System.out.println(a.equals(b));

    }

}
