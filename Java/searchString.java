import java.util.Scanner;

public class searchString {
    public static void main(String[] args) {
        System.out.println("Enter string array size");
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        System.out.println("Enter values");
        String arr[]=new String[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.next();
        }
        System.out.println("Enter string to search");
        String s1 = sc.next().toLowerCase();
   
        for (int i = 0; i < arr.length; i++) {
        if(arr[i].startsWith(s1)){
System.out.println(arr[i]);
        }
        }
sc.close();
    }

}
