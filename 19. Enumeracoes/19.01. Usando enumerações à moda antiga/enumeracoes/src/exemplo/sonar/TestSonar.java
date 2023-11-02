package exemplo.sonar;

public class TestSonar {
    // Sonar Solution to NullPointerException
    // https://rules.sonarsource.com/java/RSPEC-4551/

    public static void main(String[] args) {

        //System.out.println(isFruitGrape(null));
        System.out.println(isFruitGrape(Fruit.GRAPE));

    }

    public static boolean isFruitGrape(Fruit candidateFruit) {
        //return candidateFruit.equals(Fruit.GRAPE); // NPE
        //return candidateFruit == Fruit.GRAPE; // Sonar option
        return Fruit.GRAPE.equals(candidateFruit);
    }
}
