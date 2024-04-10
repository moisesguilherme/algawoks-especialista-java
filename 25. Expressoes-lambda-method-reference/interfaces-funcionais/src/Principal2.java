import java.util.function.*;

public class Principal2 {

    public static void main(String[] args) {

        /*Predicate<Integer> predicate = num -> num > 10;
        predicate.test(10);*/

        // Tipo primitivo
        IntPredicate predicate = num -> num > 10;
        System.out.println(predicate.test(10));

        IntFunction<String> function = num -> "Número: " + (num + 10);
        System.out.println(function.apply(10));

        IntSupplier supplier = () -> 10;
        System.out.println(supplier.getAsInt());

        IntConsumer consumer = num -> System.out.println("Número: " + num);
        consumer.accept(10);

    }
}
