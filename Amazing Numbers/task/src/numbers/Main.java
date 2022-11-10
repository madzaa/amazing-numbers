package numbers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.LogManager;

public class Main {
    public static void main(String[] args) {
        AmazingNumbersController amazingNumbersController = new AmazingNumbersController(
                new Scanner(System.in),
                new AmazingNumberService()
        );
        amazingNumbersController.startInterface();

        try {
            LogManager.getLogManager().readConfiguration(new FileInputStream("logging.properties"));
        } catch (IOException e) {
            System.err.println("Could not setup logger configuration: " + e.toString());
        }
    }
}
