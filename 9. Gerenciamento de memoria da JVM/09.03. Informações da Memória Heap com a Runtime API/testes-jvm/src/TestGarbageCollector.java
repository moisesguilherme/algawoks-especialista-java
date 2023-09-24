public class TestGarbageCollector {

    public static void main(String[] args) {
        imprimirUsoMemoria();

        byte[] x = new byte[500 * 1024 * 1024];
        imprimirUsoMemoria();
        x = null; //Garbage Collector vai fazer uma análise e pode apagar ele.

        byte[] y = new byte[10 * 1024 * 1024];
        imprimirUsoMemoria();

        //Uma sugestão para o GarbageCollector
        System.gc();

        imprimirUsoMemoria();

        /*
        byte[] h = null;
        while(true){
            imprimirUsoMemoria();
            y = null;
            h = null;
            byte[] z = new byte[100 * 1024 * 1024];
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            z = null;
            h = new byte[10 * 1024 * 1024];
            imprimirUsoMemoria();
        }*/

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
