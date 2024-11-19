package Stack;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        char[] charArray = s.toCharArray();

        for (char c : charArray){
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else {
                if (!stack.isEmpty() && isCors(stack.peek(), c)) {
                    stack.pop();
                } else {
                    return false;
                }
                
            }
        }
        return stack.isEmpty();
    }

    private boolean isCors(char c1, char c2){
        if (c1 == '{' && c2 == '}'){
            return true;
        } 
        if (c1 == '(' && c2 == ')'){
            return true;
        } 
        if (c1 == '[' && c2 == ']'){
            return true;
        }
        return false;
    }
    
}
