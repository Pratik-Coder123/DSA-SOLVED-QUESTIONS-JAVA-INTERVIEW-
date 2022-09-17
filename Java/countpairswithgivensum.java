import java.util.HashMap;

public class countpairswithgivensum {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 5, 6, 2, 4, 5, 8 };
        int sum = 10;
       
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(sum - arr[i])) {
                count = count + map.get(sum - arr[i]);
    
            }

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
               
            }

        }
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("Pair not found");
        }
    }
}
