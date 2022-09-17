//import java.util.Stack;

public class longestvalidparenthesis {
    public static void main(String[] args) {
        String s = ")()()()(";
        int open = 0, close = 0, max = 0;
        for (int i = 0; i <s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                open++;
            } else {
                close++;
            }
            if (open == close) {
                int len = open * 2;
                max = Math.max(max, len);
            } else if (close > open) {
                open = 0;
                close = 0;
            }
        }

        for (int i = s.length()-1; i >=0; i--) {
            char c = s.charAt(i);
            if (c == '(') {
                open++;
            } else {
                close++;
            }
            if (open == close) {
                int len = close * 2;
                max = Math.max(max, len);
            } else if (open >close) {
                open = 0;
                close = 0;
            }
        }
        System.out.println(max);
  // int max = 0;
        // Stack<Integer> stack = new Stack<Integer>();

        // stack.push(-1);

        // for (int i = 0; i < s.length(); i++) {
        // char c = s.charAt(i);

        // if (c == '(') {
        // stack.push(i);
        // } else {
        // stack.pop();

        // if (stack.isEmpty()) {
        // stack.push(i);
        // } else {
        // int len = i - stack.peek();
        // max=Math.max(max, len) ;
        // }
        // }

        // }
        // System.out.println(max);
    }
}
