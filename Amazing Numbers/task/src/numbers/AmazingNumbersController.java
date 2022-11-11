package numbers;

import java.text.MessageFormat;
import java.util.Scanner;
import java.util.logging.Logger;

public class AmazingNumbersController {

    Scanner scanner;

    AmazingNumberService amazingNumberService;

    Logger logger;


    public AmazingNumbersController(Scanner scanner, AmazingNumberService amazingNumberService) {
        this.scanner = scanner;
        this.amazingNumberService = amazingNumberService;
        logger = Logger.getLogger(AmazingNumbersController.class.getName());
    }

    public void startInterface() {

        System.out.println(Status.START);

        while (true) {
            try {
                System.out.println(Status.ENTER_INPUT);
                var inputs = Util.convertToArray(scanner.nextLine(), " ");

                if (inputs[0] == 0) {
                    System.out.println(Status.EXIT);
                    break;
                }
                if (inputs.length == 1) {
                    singleInputResults(inputs[0]);
                } else if (inputs.length == 2) {
                    twoInputResults(inputs[0], inputs[1]);
                }
            } catch (Exception e) {
                System.out.println(Status.WRONG_FIRST_PARAMETER);
            }
        }
    }

    public void singleInputResults(long input) {
        if (input < 0) {
            System.out.println(Status.WRONG_FIRST_PARAMETER);
        } else {
            System.out.println(printResults(input));
        }
    }

    public void twoInputResults(long inputOne, long inputTwo) {
        if (inputTwo <= 0) {
            System.out.println(Status.WRONG_SECOND_PARAMETER);
        } else {
            for (int i = 0; i < inputTwo; i++) {
                System.out.print(printSingleLineResults(inputOne));
                inputOne++;
            }
        }
    }

    public String printResults(long input) {
        return MessageFormat.format(
                Results.SINGLE_RESULT.resultMessage,
                input,
                amazingNumberService.isEven(input),
                amazingNumberService.isOdd(input),
                amazingNumberService.isBuzzNumber(input),
                amazingNumberService.isDuckNumber(input),
                amazingNumberService.isPalindrome(input),
                amazingNumberService.isGapfulNumber(input));
    }

    public String printSingleLineResults(long input) {
        return MessageFormat.format(
                Results.MULTIPLE_RESULTS.resultMessage,
                input,
                amazingNumberService.isBuzzNumber(input),
                amazingNumberService.isDuckNumber(input),
                amazingNumberService.isGapfulNumber(input),
                amazingNumberService.isEven(input),
                amazingNumberService.isOdd(input),
                amazingNumberService.isPalindrome(input));
    }
}
