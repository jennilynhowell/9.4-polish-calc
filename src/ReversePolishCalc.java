
import java.util.Stack;

//Got a lot of help from these examples: https://codereview.stackexchange.com/questions/120451/reverse-polish-notation-calculator-in-java

public class ReversePolishCalc {

    private Stack<Double> stackTop = new Stack();
    private String[] tokens;


    public double calculate(String input) {

        tokens = input.split(",");

        for(String token : tokens) {

            switch (token){
                case "+":
                    System.out.println("Now adding");
                    stackTop.push(stackTop.pop() + stackTop.pop());
                    break;

                case "-":
                    System.out.println("Now subtracting");
                    stackTop.push(-stackTop.pop() + stackTop.pop());
                    break;

                case "*":
                    System.out.println("Now multiplying");
                    stackTop.push(stackTop.pop() * stackTop.pop());
                    break;

                case "/":
                    System.out.println("Now dividing");
                    double divisor = stackTop.pop();
                    stackTop.push(stackTop.pop() / divisor);
                    break;

                default:
                    double dToken = Double.parseDouble(token);
                    stackTop.push(dToken);
                    break;
            }
        }

        // 4. return the result
        System.out.println("Your result is: " + stackTop.peek());
        return stackTop.peek();

    }

//    private void push(String number) {
//        // push on the stack
//    }
//
//    private void push(double d) {
//        // change the double to a string and then push it on the stack
//    }
//
//    private double pop() {
//        // remove the string from the top of the stack and convert it to a double and return it
//    }
}
