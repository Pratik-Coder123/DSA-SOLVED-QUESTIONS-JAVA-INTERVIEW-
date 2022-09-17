import java.util.Arrays;

public class printMissingElements {
    public static void main(String[] args) {
        int arr[] = { 10, 11, 5, 7, 13, 5 };
        Arrays.sort(arr);
        int j = 0;
        for (int i = arr[0]; i < arr[arr.length - 1]; i++) {

            if (arr[j] == i) {
                j++;
            } else {
                System.out.print(i + " ");
            }
        }

    }
}
