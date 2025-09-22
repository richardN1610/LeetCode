import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "]";

        boolean ans = isValid(s);
        System.out.println("Answer is: " + ans);
    }
    public static boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
        for(int i = 0; i < s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                charStack.push(c);
            }else{
                    if(c == ')'){
                        if (charStack.isEmpty() || charStack.pop() != '(') {
                            return false;
                        }
                    }
                    if(c == '}'){
                        if (charStack.isEmpty() || charStack.pop() != '{') {
                            return false;
                        }
                    }
                    if(c == ']'){
                        System.out.println("hi");
                        if (charStack.isEmpty() || charStack.pop() != '[') {
                            return false;
                        }
                    }
            }
        }

        return charStack.isEmpty();
    }
}
