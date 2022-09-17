public class binaryserach {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 400;
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r-l) / 2;
            if (arr[mid] == x) {
            System.out.println(mid);
            break ;
            } else if (arr[mid] < x) { 
                l = mid + 1;
            } else if(arr[mid]>x) {
                r = mid - 1;
            }if(l>r){
                System.out.println("Not found");
            }
        }
       
    }
    
}
