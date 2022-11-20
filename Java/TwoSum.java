import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 2, 6, 8, 1 };
        int target = 10;
    int result []=find(arr, target);

    for (int i = 0; i < result.length; i++) {
        System.out.print(result[i]+" ");
    }
    }
    private static int [] find(int[] arr, int target) {
int count=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int rem=target-arr[i];
            if(map.containsKey(rem)){
                count++;
                System.out.println(count);
                return new int [] {(map.get(rem)),i};
            }
            map.put(arr[i], i);

        }

        return new int[] { };
    }
}