

public class missingandrepeating {
    public static void main(String[] args) {

        int arr[] = { 7, 3, 4, 5, 5, 6, 2,2 };

        System.out.println("repeating ");
       for (int i = 0; i < arr.length; i++) {
        int num= Math.abs(arr[i])-1 ;
if(arr[num]<0){
    System.out.print(num+1+" ");
}else{
    arr[num]=arr[num]*-1 ;
}
     
       }
       System.out.println("\n"+"missing ");

for (int index = 0; index < arr.length; index++) {
    
    if(arr[index]>0){
        System.out.print(index+1+" ");
    }
}
    }
}