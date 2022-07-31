
package javaapplication1;
interface  ABCD{
    void show();
    void show2();
}
abstract class deff implements ABCD{
    @Override
    public void show(){
        System.out.println("This is show");
    }

}
class ghii extends deff{
    @Override
    public void show2(){
        System.out.println("This is show 2");
    }
}
public class InterfacePartialImplementation {
    public static void main(String[] args) {
         ghii g = new ghii();
         g.show2();
    }
}
