public class string {
   public static void main(String[] args) {
    
    String input []= {"h","e","l","l","o"} ;
    
StringBuffer sb = new StringBuffer();

for(int i=input.length-1 ;i>=0;i--){

    sb.append(input[i]);
}
    
System.out.println(sb+" ");

}   
}
