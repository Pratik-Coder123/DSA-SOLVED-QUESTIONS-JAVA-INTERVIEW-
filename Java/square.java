
import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        System.out.println("Enter value");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int start = 0;
        int end = x;
        int mid;
        double ans = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (mid * mid == x) {
                ans = mid;
            }
            if (mid * mid < x) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
    
        int precision=3;
        double increment = 0.01;
        for (int i = 0; i < precision; i++) {
            while (ans * ans <= x) {
                ans += increment;
            }
             ans = ans - increment;
            increment = increment / 10;

        }
        int ans2;
         ans2= (int) ans ;
        if(ans2==ans){
            System.out.println(ans2); 
        }else{
        float ans1= (float) ans;
        System.out.printf("%.3f",ans1);  
        }
        sc.close();
    }
}
