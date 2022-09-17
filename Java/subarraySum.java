import java.util.HashMap;

public class subarraySum {
   public static void main(String[] args) {
      int arr[] = { 10, 2, -2, -20, 10 };
      int target = -10;
      int count = 0;
      HashMap<Integer, Integer> map = new HashMap<>();
      map.put(0, 1);
      int sum = 0;
      for (int i = 0; i < arr.length; i++) {
         sum = sum + arr[i];
         if (map.containsKey(sum - target)) {
           count+= map.get(sum - target);
         }
         map.put(sum, map.getOrDefault(sum, 0)+1) ;
      }
System.out.println(count);
   }
}

// int count = 0;
// int n = arr.length;
// for (int i = 0; i < n; i++) {
// int s = 0;
// for (int j = i; j < n; j++) {
// s = s + arr[j];
// if (s == sum) {
// count++;
// }
// }
// }

// System.out.println(count);