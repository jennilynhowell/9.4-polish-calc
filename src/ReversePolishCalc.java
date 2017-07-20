import java.util.ArrayList;
import java.util.Stack;

public class ReversePolishCalc {

    // You'll need a variable here to keep track of the top of the stack
    private Stack<Double> stackTop = new Stack();

    // The array of the input string split up
    private String[] tokens;

    // The stack
    //what is the point of this?
    private String[] stack;

    public double calculate(String input) {

        // 1. Use the String split method to split the string into tokens at the commas
        tokens = input.split(",");

        // 2. Allocate a stack as big as the number of tokens
        //stack =

        //3. write the algorithm
        for(String token : tokens) {
            System.out.println("I got a token: " + token);

//            double firstInt = 0.0;
//            double secondInt = 0.0;

            switch (token){
                case "+":
                    System.out.println("Now adding");
                    stackTop.push(stackTop.pop() + stackTop.pop());
                    break;

                case "-":
                    System.out.println("Now subtracting");
                    stackTop.push(stackTop.pop() - stackTop.pop());
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
                    System.out.println("Added!" + dToken);
                    break;
            }
        }

        // 4. return the result
        System.out.println("Your result is: " + stackTop.pop());
        return stackTop.pop();
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
