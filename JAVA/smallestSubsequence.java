import java.util.Stack;
public class smallestSubsequence {
  public static void main(String[] args) {
    String s = "leetcode";
    int k = 3;
    int n = s.length();
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < n; i++) {
      if (stack.isEmpty()) {
        stack.add(s.charAt(i));
      } else {
        while (!stack.isEmpty() && s.charAt(i) < stack.peek() && n - i - 1 >= k - stack.size()) {
          stack.pop();
        }
        if (stack.isEmpty() || stack.size() < k) {
          stack.add(s.charAt(i));
        }
      }
    }
    String result="";
    while(!stack.isEmpty()){
      result=result+stack.peek();
     stack.pop();
    }
    System.out.println(result);
    StringBuilder sb=new StringBuilder(result);
    sb.reverse();
    System.out.println(sb);
  }
}
