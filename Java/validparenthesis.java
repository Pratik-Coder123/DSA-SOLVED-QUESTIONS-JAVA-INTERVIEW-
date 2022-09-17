import java.util.Stack;

public class validparenthesis {

    public static void main(String[] args) {
        String s = "([)]{}";

        System.out.println(validpara(s));
    }

    private static boolean validpara(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {

                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                System.out.println(stack.peek());
                if (c == '(' && stack.peek() != ')') {
                    return false;
                }
                if (c == '[' && stack.peek() != ']') {
                    return false;
                }
                if (c == '{' && stack.peek() != '}') {
                    return false;
                }

                stack.pop();

            }

        }

        return stack.isEmpty() ;

    }
}
