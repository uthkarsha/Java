
package javaapplication1;

interface abc{
    final int n=0;
    void show1();
    void show2();
}
abstract class def implements abc{
    @Override
    public void show1(){
        System.out.println("This is show 1");
    }
    
}
class ghi extends def{
    @Override
    public void show2(){
        System.out.println("This is show 2");
    }
}

public class Interface {
    public static void main(String[] args) {
        ghi g1 = new ghi();
        g1.show2();

    }
    
}
