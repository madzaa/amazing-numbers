package numbers;

import java.util.Arrays;

public class AmazingNumberService {
    public boolean isEven(long input) {
        return input % 2 == 0;
    }

    public boolean isOdd(long input) {
        return input % 2 != 0;
    }

    public boolean isDivisibleBySeven(long number) {
        return number % 7 == 0;
    }

    public boolean endsWithSeven(long number) {
        return number % 10 == 7;
    }

    public boolean isBuzzNumber(long number) {
        return endsWithSeven(number) || isDivisibleBySeven(number);
    }

    public boolean isDuckNumber(long number) {
        String stringOfNumbers = String.valueOf(number);
        char[] digits = stringOfNumbers.toCharArray();

        for (int i = 1; i < digits.length; i++) {
            if ("0".equals(String.valueOf(digits[i]))) {
                return true;
            }
        }
        return false;
    }

    public boolean isPalindrome(long number) {

        var splitNumbersArray = Util.convertToArray(number, "");
        String[] palindromeArray = new String[splitNumbersArray.length];

        for (int i = splitNumbersArray.length - 1; i >= 0; i--) {
            palindromeArray[splitNumbersArray.length - 1 - i] = splitNumbersArray[i];
        }

        return Arrays.equals(palindromeArray, splitNumbersArray);
    }

    public boolean isGapfulNumber(long number) {

        var splitNumbersArray = Util.convertToArray(number, " ");

        if (splitNumbersArray.length < 3) {
            return false;
        }

        long gapfulRemainder = Long.parseLong(splitNumbersArray[0] + splitNumbersArray[splitNumbersArray.length - 1]);

        return number % gapfulRemainder == 0;
    }


}
