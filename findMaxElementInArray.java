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

       int max = Integer.MIN_VALUE;

       for(int i =0; i<n; i++){
        if (max<arr[i]){
            max= arr[i];
        }
       }
       System.out.println("Max is: "+ max);
    }
}
