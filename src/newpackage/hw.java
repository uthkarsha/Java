package newpackage;
abstract class AB{
    int a;
    int b;
    void show1(){
        System.out.println("This is show1");
    }
    abstract void show2();
    abstract void show3();
}
abstract class CD extends AB{
    @Override
    void show2(){
        System.out.println("This is show2");
    }
}
class EF extends CD{
    @Override
    void show3(){
        System.out.println("This is show3");
    }
}
abstract class GH extends AB{
    @Override
    void show2(){
        System.out.println("This is show 4");
    }
}
class IJ extends GH{
    @Override
    void show3(){
        System.out.println("This is show 5");
    }
}

public class hw {
    public static void main(String[] args) {
     EF ef1 = new EF();
     ef1.show3();
    }
}
