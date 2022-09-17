public class bubblesort {
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };   
int flag=0 ;
for (int i = 0; i < arr.length; i++) {
    
    for (int j = 0; j < arr.length-1-i; j++) {
        
        if(arr[j]>arr[j+1]){
        int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp ;
            flag=1 ;
        }  
    }
    if(flag==0){
        break ;
    }
   
}

for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
    }
}
