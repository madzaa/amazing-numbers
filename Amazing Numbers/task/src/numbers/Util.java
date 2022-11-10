
package numbers;

public class Util {

    private Util() {
        throw new IllegalStateException("Utility class");
    }

    public static String[] convertToArray(long number, String regex) {
        String stringOfNumbers = String.valueOf(number);

        return stringOfNumbers.split(regex);
    }
}