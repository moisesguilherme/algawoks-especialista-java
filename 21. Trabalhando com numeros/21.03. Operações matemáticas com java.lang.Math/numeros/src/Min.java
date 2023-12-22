public class Min {

    public static void main(String[] args) {
        int x = 300;
        int y = 200;

        //int z = Math.min(x, y);

        // Internamente usa o Math.min
        // Foi criado no Java 8
        int z = Integer.min(x, y);
        System.out.println(z);

    }

}