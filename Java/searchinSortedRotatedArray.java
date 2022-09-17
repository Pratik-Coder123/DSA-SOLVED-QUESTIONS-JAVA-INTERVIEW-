public class searchinSortedRotatedArray {
    public static void main(String[] args) {

        int arr[] = { 8,9,10,2,3,4,5,6,7 };
        int target = 10;

        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (arr[mid] == target) {
                System.out.println(mid);
            }

            if (arr[l] <= arr[mid]) {

                if (arr[l] <= target && target <= arr[mid]) {

                    r = mid - 1;
                } else {
                    l = mid + 1;
                }

            } else {
                if (arr[mid] <= target && target <= arr[r]) {

                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }

        }

    }
}
