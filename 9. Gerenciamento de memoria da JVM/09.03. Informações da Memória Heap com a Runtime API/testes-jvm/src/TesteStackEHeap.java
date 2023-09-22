public class TesteStackEHeap {

    public static void main(String[] args) {
        int a = 40;

        // Stack (Pilha de chamada um método chamando outro)
        metodo1(a);
    }

    static void metodo1(int x) {
        int z = x * 2;
        // Stack
        System.out.println("Chamou metodo1");
        metodo2();
    }

    static void metodo2() {

        // Memória Heap (Objeto sempre na Heap)
        System.out.println("Chamou metodo2");
        Produto p = new Produto(10, 120.3);
        //p.codigo = 10;
        //p.preco = 120.34;
    }

    public record Produto(Integer codigo, Double preco){}

}
