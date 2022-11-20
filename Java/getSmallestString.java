import java.util.Arrays;

public class getSmallestString {
    public static void main(String[] args) {

        int n = 5;
        int k = 73;

        char result []=new char[n];
Arrays.fill(result,'a');
k=k-n;

while(k>0){
    result[n-1]= (char) (result[n-1]+Math.min(25,k));
    k=k-Math.min(k,25);
    n--;
}

System.out.println(result);

    }
}
