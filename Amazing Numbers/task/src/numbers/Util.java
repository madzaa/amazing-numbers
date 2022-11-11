
package numbers;

import java.util.Arrays;

public class Util {

    private Util() {
        throw new IllegalStateException("Utility class");
    }

    public static String[] convertToArray(long number, String regex) {
        String stringOfNumbers = String.valueOf(number);
        return stringOfNumbers.split(regex);
    }

    public static long[] convertToArray(String number, String regex) {
        return Arrays.stream(number.split(regex)).mapToLong(Long::parseLong).toArray();
    }

}