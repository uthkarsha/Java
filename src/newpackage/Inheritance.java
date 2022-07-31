package newpackage;

class A{
    int x=10;
}
class B extends A{
    int y=20;
}
class C extends B{
    int z=30;
}

public class Inheritance {
    public static void main(String[] args) {
        B obB = new B();
        A obA = new A();
        C obC = new C();
        System.out.println(obC.x);

    }
}
