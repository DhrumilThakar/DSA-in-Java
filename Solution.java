import java.util.*;

public class Solution {

    // (a) Valid Parentheses
    public static boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    // (b) Infix to Postfix Conversion
    public static String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        Map<Character, Integer> precedence = new HashMap<>();
        precedence.put('+', 1);
        precedence.put('-', 1);
        precedence.put('*', 2);
        precedence.put('/', 2);

        for (char c : expression.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();  // Pop the '('
            } else {
                while (!stack.isEmpty() && precedence.getOrDefault(stack.peek(), 0) >= precedence.get(c)) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }

    // (c) Postfix Evaluation
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');  // Convert char to int
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (c) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                }
            }
        }
        return stack.pop();
    }

    // (d) Generate Binary Numbers from 1 to N using Queue
    public static List<String> generateBinaryNumbers(int n) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        while (n-- > 0) {
            String binary = queue.poll();
            result.add(binary);
            queue.add(binary + "0");
            queue.add(binary + "1");
        }
        return result;
    }

    // Main method to test all functions
    public static void main(String[] args) {
        // (a) Test Valid Parentheses
        String s1 = "()";
        System.out.println("Valid Parentheses: " + isValidParentheses(s1));  // true

        // (b) Test Infix to Postfix Conversion
        String infix = "A+B*C+D";
        System.out.println("Infix to Postfix: " + infixToPostfix(infix));  // ABC*+D+

        // (c) Test Postfix Evaluation
        String postfix = "231*+9-";
        System.out.println("Postfix Evaluation: " + evaluatePostfix(postfix));  // -4

        // (d) Test Binary Number Generation
        int n = 5;
        System.out.println("Binary Numbers from 1 to " + n + ": " + generateBinaryNumbers(n));
        // Output: [1, 10, 11, 100, 101]
    }
}
