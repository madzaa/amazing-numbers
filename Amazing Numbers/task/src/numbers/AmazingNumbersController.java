package numbers;

import java.text.MessageFormat;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;

public class AmazingNumbersController {

    Scanner scanner;

    AmazingNumberService amazingNumberService;

    ConsoleHandler handler = new ConsoleHandler();
    Logger logger;


    public AmazingNumbersController(Scanner scanner, AmazingNumberService amazingNumberService) {
        this.scanner = scanner;
        this.amazingNumberService = amazingNumberService;
        logger = Logger.getLogger(AmazingNumbersController.class.getName());
    }

    public void startInterface() {

        System.out.println(Status.START.toString());

        while (true) {
            logger.fine("Enter a request:");
            long input = scanner.nextLong();

            if (input < 0) {
                System.out.println("The first parameter should be a natural number or zero.");
            }

            if (input == 0) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.println(printResults(input));
        }
    }

    public String printResults(long input) {
        return MessageFormat.format(
                """
                        Properties of {0}
                                even: {1}
                                 odd: {2}
                                buzz: {3}
                                duck: {4}
                                palindromic: {5}
                                gapful: {6}
                        """,
                input,
                amazingNumberService.isEven(input),
                amazingNumberService.isOdd(input),
                amazingNumberService.isBuzzNumber(input),
                amazingNumberService.isDuckNumber(input),
                amazingNumberService.isPalindrome(input),
                amazingNumberService.isGapfulNumber(input));

    }
}
