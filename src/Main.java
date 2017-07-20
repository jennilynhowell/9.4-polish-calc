public class Main {
    public static void main(String[] args) {
        ReversePolishCalc rpc = new ReversePolishCalc();

        String rpnExpression = "2.5,4.8,+";
        double expectedResult = 7.3;
        double actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        rpnExpression = "3.0,1.0,-";
        expectedResult = 2.0;
        actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        rpnExpression = "7.2,1.9,*";
        expectedResult = 13.68;
        actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        rpnExpression = "9.5,4.75,/";
        expectedResult = 2;
        actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        rpnExpression = "5,1,2,+,4,*,+,3,-";
        expectedResult = 14.0;
        actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);
    }

    private static void checkResult(String expression, double expected, double actual) {
        if (expected == actual) {
            System.out.println("SUCCESS: " + expression + " is " + expected);
        } else {
            System.out.println("ERROR: " + expression + " expected " + expected + " actual " + actual);
        }
    }
}
