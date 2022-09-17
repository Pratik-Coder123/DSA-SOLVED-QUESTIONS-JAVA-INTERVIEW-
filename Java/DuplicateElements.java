import java.util.HashMap;
//import java.util.HashSet;
import java.util.Map;

public class DuplicateElements {
    public static void main(String[] args) {

        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };

        // HashSet<Integer> set = new HashSet<>();

        // for (int i = 0; i < nums.length; i++) {

        //     if (!set.contains(nums[i])) {
        //         set.add(nums[i]);
        //     } else {
        //         System.out.println(nums[i]);
        //     }
        // }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {

                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer,Integer> m:map.entrySet()) {  
            if(m.getValue()>1){
System.out.println(m.getKey());
            }

        }
    }
}

