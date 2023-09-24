public class TestGarbageCollector5 {

    public static void main(String[] args) {
        imprimirUsoMemoria();

        Cliente cliente = new Cliente();
        Endereco endereco = new Endereco();

        cliente.endereco = endereco;
        endereco.cliente = cliente;

        //cliente = null; //não vai tornar inalcancável pois ainda tem a referencia abaixo
        //endereco.cliente = null;

        cliente = null;
        endereco = null;



        imprimirUsoMemoria();

        System.gc();

        imprimirUsoMemoria();
    }

    static void imprimirUsoMemoria() {
        // Memória q a JVM pode usar
        System.out.printf("Máxima: %s%n", emMegabytes(Runtime.getRuntime().maxMemory()));

        // Total de memória reservada
        System.out.printf("Total empenhada: %s%n", emMegabytes(Runtime.getRuntime().totalMemory()));

        // Total de memória disponível
        System.out.printf("Disponível: %s%n", emMegabytes(Runtime.getRuntime().freeMemory()));

        long memoriaUsada = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        System.out.printf("Usada: %s%n", emMegabytes(memoriaUsada));

        System.out.println("----");
    }


    static String emMegabytes(long bytes) {
        return String.format("%.2fMB", bytes / 1024d / 1024d);
    }
}
