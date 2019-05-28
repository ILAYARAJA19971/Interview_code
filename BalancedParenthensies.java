import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthensies {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(balancedParenthensies(str)?"Balanced":"not Balanced");        
    }
    public static boolean balancedParenthensies(String s) {
        Stack<Character> stack  = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '[':
                case '(':
                case '{':
                    stack.push(c);
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }   break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }   break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }   break;
                default:
                    break;
            }
        }
        return stack.isEmpty();
    }
}
