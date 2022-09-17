public class mergesorting {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int n = arr.length;
        mergesort(arr, 0, n - 1);
        for (int index = 0; index < arr.length; index++) {
            System.out.println(arr[index]);
        }
    }
    private static void mergesort(int[] arr, int i, int j) {

        //dividing array until we get one element
        if (i < j) {
            int mid = (i + j) / 2;
            mergesort(arr, i, mid);  
            mergesort(arr, mid + 1, j);
            merge(arr, i, mid, j);
        }
    }
    private static void merge(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = low;
        int b[] = new int[arr.length];
        while (i <= mid && j <= high) {

            if (arr[i] < arr[j]) {
                b[k] = arr[i];
                k++;
                i++;
            } else {
                b[k] = arr[j];
                k++;
                j++;
            }
        }
        while (i <= mid) {
            b[k] = arr[i];
            i++;
            k++;
        }
        while (j <= high) {
            b[k] = arr[j];
            k++;
            j++;
        }
        for (i = low; i <= high; i++) {
            arr[i] = b[i];
        }
    }
}
