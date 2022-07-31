
package newpackage;

import java.util.Scanner;
public class search {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         int arr[]=new int[10];
         int n=sc.nextInt();
         for(int i=0; i<n;i++){
             arr[i]= sc.nextInt();
         }
        int x=sc.nextInt();
        int cnt =0;
        for (int i=0; i<n; i++){
            if (arr[i]==x){
                cnt++;
            }
        }
        if (cnt>0){
            System.out.println("Found "+cnt+" times");
        }
        else {
            System.out.println("not found");
        }
    }
}
