// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

       for(int i =0; i<n ;i++){
        arr[i]=in.nextInt();
       }

       int first = 0;
       int last = n-1;
       
       while(first<last){
           int temp = arr[first];
           arr[first] = arr[last];
           arr[last] = temp;
           
           first++; last--;
       }
       
       for(int i =0;i<n;i++){
           System.out.print(arr[i]);
       }
       
    }
}
