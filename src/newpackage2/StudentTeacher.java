package newpackage2;

import java.util.Scanner;
class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
class Student extends Person{
    int id;
    double cgpa;
    Student(String name, int age, int id, double cgpa){
        super(name,age);
        this.id = id;
        this.cgpa = cgpa;
    }
}

class Teacher extends Person{
    int id;
    String subject;
    Teacher(String name, int age, int id, String subject){
        super(name,age);
        this.id = id;
        this.subject = subject;
    }
}
public class StudentTeacher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name,subject;
        int id,age;
        double cgpa;
        
        name = sc.next();
        age = sc.nextInt();
        id = sc.nextInt();
        cgpa = sc.nextDouble();
        Student s1 = new Student(name,age,id,cgpa);
        
        name = sc.next();
        age = sc.nextInt();
        id = sc.nextInt();
        cgpa = sc.nextDouble();
        Student s2 = new Student(name,age,id,cgpa);
        
        name = sc.next();
        age = sc.nextInt();
        id = sc.nextInt();
        subject = sc.next();
        
        Teacher T1 = new Teacher(name,age,id,subject);
        name = sc.next();
        age = sc.nextInt();
        id = sc.nextInt();
        subject = sc.next();
        Teacher T2 = new Teacher(name,age,id,subject);
        
        
        System.out.println("students: ");
        System.out.println(s1.name+" "+s1.age+" "+s1.id+" "+s1.cgpa);
        System.out.println(s2.name+" "+s2.age+" "+s2.id+" "+s2.cgpa);
        
        System.out.println("Teachers: ");
        System.out.println(T1.name+" "+T1.age+" "+T1.id+" "+T1.subject);
        System.out.println(T2.name+" "+T2.age+" "+T2.id+" "+T2.subject);
    }
}

