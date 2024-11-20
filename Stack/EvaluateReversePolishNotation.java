package Stack;

import java.util.Arrays;
import java.util.Set;
import java.util.Stack;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>(); 

        Set<String> operators = Set.of("+", "-", "*", "/");
        for (String str : tokens){
            if (!operators.contains(str)) {
                stack.push(Integer.parseInt(str));
            } else {
                int op1 = stack.pop();
                int op2 = stack.pop();
                int result = doOperation(op1, op2, str);
                stack.push(result);
            }
        }
        return stack.peek();
    }

    private int doOperation (int op1, int op2, String operator) {

        int result;

        if (operator.equals("+")){
            result = op2 + op1;
        } else if (operator.equals("-")){
            result = op2 - op1;
        } else if (operator.equals("*")){
            result = op2 * op1;
        } else {
            result = op2 / op1;
        }
        return result; 
    }
}
