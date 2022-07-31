
package newpackage;
class Poly{
    int x;
    
    //constructor overloading
    Poly(){
        
    }
    Poly(int a){
        
    }
    
    
    //Method overloading
    void show(){
        System.out.println("This is show 1");
    }

    void show( int a){
        System.out.println("This is show 2");
    }
    void show(char b){
        System.out.println("This is show 3");
    }
    void show( int a, char b){
        System.out.println("This is show 4");
    }
    void show( char b, int a){
        System.out.println("This is show 5");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Poly ob = new Poly();
        ob.show(2,'a');
    }
    
}
