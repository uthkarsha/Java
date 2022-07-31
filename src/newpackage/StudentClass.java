package newpackage;

class Student {
    String name;
    String ID;
    double CGPA;
    int age;

    Student(String name, String ID, double CGPA, int age){
        this.name = name;
        this.ID = ID;
        this.CGPA = CGPA;
        this.age = age;
    }
    
}
public class StudentClass {
    public static void main(String[] args) {
        String name;
        
        
        Student std1 = new Student("Uthkarsha","1234",4.00,18);
       
        System.out.println(std1.name+" "+std1.ID+" "+std1.CGPA+" "+std1.age);
    }
}
