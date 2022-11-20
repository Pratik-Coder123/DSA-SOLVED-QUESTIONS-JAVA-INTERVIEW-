import java.util.Stack;

public class longestValidParentheses {
    public static void main(String[] args) {
        String s = ")()())";
        System.out.println( longest(s));
    }

    private static int longest(String s) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    int len = i - stack.peek();
                    max = Math.max(max, len);
                }
            }
        }
return max;
    }
}