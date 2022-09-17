public class rotatearray {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        int l = 0;
        int r = arr.length - 1;

        System.out.println("rotate right side of array");
        reverse(arr, r - k + 1, r);//
        for (int index = 0; index < arr.length; index++) {
            System.out.print(+arr[index] + " ");
        }

        System.out.println("\n"+"rotate left side of array");
        reverse(arr, 0, k);
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index]+" ");
        }

        System.out.println("\n" + "rotate all elements");
        reverse(arr, l, r);// rotate all elements
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");

        }
    }

    private static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

    }
}
