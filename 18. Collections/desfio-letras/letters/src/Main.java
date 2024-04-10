import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {


        // Desafio palavra
        // BANANA, contar quantindade de letras
        // Usando hashMap

        String word = "BANANA";

        HashMap<Character, Integer> letters = new HashMap<>();

        /*for (char c : word.toCharArray()) {
            if(letters.containsKey(c))
                letters.put(c, letters.get(c) + 1);
            else
                letters.put(c,1);
        }*/

        word.chars().forEach(c -> letters.compute((char) c, (key, value) -> (value == null) ? 1 : value + 1));


        /*for(var entry: letters.entrySet()) {
            System.out.println("Letra: " + entry.getKey() + " " + entry.getValue() + "x");
        }*/

        letters.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}