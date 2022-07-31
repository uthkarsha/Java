
package newpackage;

class A{
    int a=10;
    String s = "Uthkarsha";
    void show(){
        UnderstandingClass uc = new UnderstandingClass();
        System.out.println(uc.p);
    }
    
}

public class UnderstandingClass {
    int p = 20;
    public static void main(String[] args) {
        int x=10;
        A ob = new A();
        System.out.println(ob.s);
        ob.s = "Tonmoy";
        System.out.println(ob.s);
        A ob1 = new A();
        System.out.println(ob1.s);
        System.out.println(x);
        ob1.show();
    }
}
