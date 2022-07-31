
package javaapplication1;

import java.util.Scanner;


public class class3 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int x;
            int mx=0;
            for (int i=0; i<n; i++){
                x=sc.nextInt();
                if (x>mx){
                    mx=x;
                }
                
            }
            System.out.println(mx);
    }
}
