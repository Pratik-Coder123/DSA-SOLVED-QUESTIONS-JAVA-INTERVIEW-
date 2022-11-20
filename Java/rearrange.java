
import java.util.Scanner;

public class rearrange {
    public static void main(String[] args) {
        System.out.println("Enter Array size");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        long arr []=new long[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int max = n-1;
        int min = 0;
        
        //Creating temp array to store modified array
        long temp[] = arr.clone();
        for (int i = 0; i < temp.length; i++) {
            //Every max element is on even index
            if(i%2==0){
                temp[i]=arr[max];
                max--;
            }else{
                temp[i]=arr[min];
                min++;
            }
        }
       for (int i = 0; i < temp.length; i++) {
        System.out.print(temp[i]+" ");
       }
       sc.close();
    }
}
