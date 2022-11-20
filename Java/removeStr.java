import java.util.Scanner;

public class removeStr {
    public static void main(String[] args) {

        System.out.println("Enter first string");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println("Enter Second string");
        String s2 = sc.nextLine();
        String ans = "";
        for (int i = 0; i < s1.length(); i++) {
            int flag = 0;
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    flag = 1;
                }
            }
            if(flag!=1){
                ans+=s1.charAt(i);
                
            }
        }
System.out.println(ans);
sc.close();
    }
}
