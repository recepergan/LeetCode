import java.util.Scanner;
import java.util.Stack;

public class $006ValidParentheses {
    public static void main(String[] args) {
        String inputStr;

        // create an instance of Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input string to check:");
        // take input sring from user
        inputStr = sc.nextLine();

        // call balancedParenthesis() method to check whether input string is balanced of not
        if (Solution.isValid(inputStr))
            System.out.println("Input string "+inputStr+" is balanced.");
        else
            System.out.println("Input string "+inputStr+" is not balanced.");
    }
}

class Solution {
    public static boolean isValid(String s) {

        Stack stack = new Stack();

        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            char current = charArray[i];

            if (current == '{' || current == '[' || current == '(') {
                stack.push(current);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            char popChar;
            switch (current) {
                case '}':
                    popChar = (char) stack.pop();
                    if (popChar == '(' || popChar == '[')
                        return false;
                    break;
                case ']':
                    popChar = (char) stack.pop();
                    if (popChar == '(' || popChar == '{')
                        return false;
                    break;
                case ')':
                    popChar = (char) stack.pop();
                    if (popChar == '[' || popChar == '{')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }
}
