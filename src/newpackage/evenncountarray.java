package newpackage;
import java.util.Scanner;
public class evenncountarray {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
         int arr[]=new int[n];
         for (int i=0; i<n; i++){
             arr[i]=sc.nextInt();
         }
         int cnt=0;
         for (int i=0; i<n; i++){
             if (arr[i]%2==0){
                 cnt++;
             } 
         } 
         System.out.println("Total even no.: "+cnt);
    }
    
}
