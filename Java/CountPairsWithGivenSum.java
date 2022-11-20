import java.util.HashMap;

public class CountPairsWithGivenSum {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 2, 6, 8, 1 };
        int target = 10;

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int rem = target - arr[i];
            if (map.containsKey(rem)) {
    System.out.println(arr[i]+"  "+rem);
                count = count + map.get(rem);
            }
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }
        System.out.println(count);
    }
}
