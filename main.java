

import java.util.Arrays;

import Stack.EvaluateReversePolishNotation;


public class main {
    public static void main(String[] args) {

        EvaluateReversePolishNotation solution = new EvaluateReversePolishNotation();

        String[] tokens = {"2","1","+","3","*"};
        // System.out.println(!Arrays.asList(tokens).contains("2"));
        System.out.println(solution.evalRPN(tokens));

    }
}
