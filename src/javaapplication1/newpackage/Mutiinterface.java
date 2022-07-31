
package javaapplication1.newpackage;
interface intf1{
    void show1();
}
interface intf2 extends intf1{
    void show2();
}
abstract class impl1 implements intf2{
    @Override
    public void show1(){
        System.out.println("show 1");
    }
    
}
class impl2 extends impl1{
    @Override
    public void show2(){
        System.out.println("show 2");
    }
}
public class Mutiinterface {
    public static void main(String[] args) {
        impl2 ob = new impl2();
        ob.show2();
    }
}
