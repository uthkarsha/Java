
package javaapplication1;
class Check{
    static int n=0;
}
public class understandingstatic {
    public static void main(String[] args) {
        Check c= new Check();
        System.out.println(c.n);
        c.n=5;
        System.out.println(c.n);
        Check c2=new Check();
        System.out.println(c2.n);
    }
}
