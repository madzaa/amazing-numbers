package numbers;

public enum Results {
    SINGLE_RESULT("""
            Properties of {0}
                    even: {1}
                     odd: {2}
                    buzz: {3}
                    duck: {4}
             palindromic: {5}
                  gapful: {6}
                        """),

    MULTIPLE_RESULTS("""
                {0} is {1}, {2}, {3}, {4}, {5}, {6}
            """);
    final String resultMessage;

    Results(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    @Override
    public String toString() {
        return this.resultMessage;
    }

}
