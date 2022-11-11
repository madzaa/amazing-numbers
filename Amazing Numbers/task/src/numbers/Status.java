package numbers;

public enum Status {

    START("""
            Welcome to Amazing Numbers!
                    
            Supported requests:
            - enter a natural number to know its properties;
            - enter two natural numbers to obtain the properties of the list:
              * the first parameter represents a starting number;
              * the second parameter shows how many consecutive numbers are to be processed;
            - separate the parameters with one space;
            - enter 0 to exit.
                """),
    ENTER_INPUT("Enter a request:"),
    WRONG_FIRST_PARAMETER("The first parameter should be a natural number or zero."),
    WRONG_SECOND_PARAMETER("The second parameter should be a natural number or zero."),

    EXIT("Goodbye!");
    final String statusMessage;

    Status(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    @Override
    public String toString() {
        return this.statusMessage;
    }
}