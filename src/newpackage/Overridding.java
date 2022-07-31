
package newpackage;
class AA{
    void show(int x){
        System.out.println("This is class AA");
    }
}
class BB extends AA{
    @Override
    void show(int x){
        if(x>5){
            super.show(x);
        }
        else
            System.out.println("This is class BB");
        
    }
}
public class Overridding {
    public static void main(String[] args) {
        BB b1 = new BB();
        b1.show(10);
        
    }
}
