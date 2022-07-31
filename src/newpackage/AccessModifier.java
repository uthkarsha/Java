
package newpackage;
class Test{
    protected int n=5;
    private int p = 1234;
    
    //getter method
    int get(){
        return p;
    }
    void set(int p){
        this.p = p;
    }
}
class Test2 extends Test{
    int x = n;
}
public class AccessModifier {
    public static void main(String[] args) {
        Test t = new Test();
        //System.out.println(t.n);
        //System.out.println(t.p);
        int password = t.get();
        System.out.println(password);
        t.set(6789);
        password = t.get();
        System.out.println(password);
        
    }
}
