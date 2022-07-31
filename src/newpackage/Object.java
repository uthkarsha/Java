
package newpackage;

class Human{
    String name;
    int age;
    
}

public class Object {

    public static void main(String args[]) {
        Human h1 = new Human();
        h1.name = "Uhkarsha";
        h1.age = 18;
        
        Human h2 = new Human();
        h2.name = "Tonmoy";
        h2.age = 22;
        
        System.out.println(h1.name+" "+h1.age);
        System.out.println(h2.name+" "+h2.age);
    }
}
