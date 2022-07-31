
package javaapplication1;
abstract class ABC{
    abstract void show1();
    abstract void show2();
}
abstract class def extends ABC{
    @Override
    void show1(){
        System.out.println("This is show 1");
    }
}
class ghi extends def{
    @Override
    void show2(){
        System.out.println("This is show 2");
    }
}
public class partialimplementation {
    public static void main(String[] args) {
        
    }
}
