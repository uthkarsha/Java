
package newpackage;
class Extra{
    void show(int x)throws ArithmeticException{
        if(x==0){
            throw new ArithmeticException();
        }
        System.out.println("After throw");
        
    }
}
public class ExceptionHandeling {
    
    public static void main(String[] args) {
        int a=1;
        int b=20;
        int ans;
        int arr[] = new int[5];
        try{
            Extra ob = new Extra();
            ob.show(1);
            ans = b/a; //arithmatic exception
            arr[2] = 10; //ArrayIndexOutOfBoundsException


        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException caught");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }
        finally{
            System.out.println("Finally block");
        }
    }
}
