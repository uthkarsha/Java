
package newpackage;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int arr[]=new int[10];
         Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
         for(int i=0; i<n;i++){
             arr[i]=sc.nextInt();
            
                     
         }
         int mx=arr[0];
         for(int i=1; i<n; i++){
             if(arr[i]<mx){
                 mx=arr[i];
                 
             }
         }
              System.out.println(mx+" is the lowest");   
         
    }
    
}
