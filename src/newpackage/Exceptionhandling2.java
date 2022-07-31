
package newpackage;
import java.util.Scanner;
import java.lang.Math;
public class Exceptionhandling2 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          double x,y;
          try{
              if(a==0){
                  throw new ArithmeticException("divided by zero");
              }
              if((b*b)-(4*a*c)<0){
                  throw new ArithmeticException("complex number");
              }
            x = ((-1*b) + Math.sqrt((b*b)-(4*a*c)))/(2*a);
              System.out.println(x);
              y = ((-1*b) - Math.sqrt((b*b)-(4*a*c)))/(2*a);
              System.out.println(y);
          }
          catch(ArithmeticException e){
              System.out.println(e);
          }
          
    }
}
