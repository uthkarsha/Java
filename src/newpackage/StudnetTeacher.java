
package newpackage;

import java.util.Scanner;


class Person{
    String name;
    int age;
}
class Student extends Person{
    int id;
    double cgpa;
}
class Teacher extends Person{
    int id;
    String subject;
}
public class StudnetTeacher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.name = sc.next();
        s1.age = sc.nextInt();
        s1.id = sc.nextInt();
        s1.cgpa = sc.nextDouble();
        Student s2 = new Student();
        s2.name = sc.next();
        s2.age = sc.nextInt();
        s2.id = sc.nextInt();
        s2.cgpa = sc.nextDouble();
        Teacher T1 = new Teacher();
        T1.name = sc.next();
        T1.age = sc.nextInt();
        T1.id = sc.nextInt();
        T1.subject = sc.next();
        Teacher T2 = new Teacher();
        T2.name = sc.next();
        T2.age = sc.nextInt();
        T2.id = sc.nextInt();
        T2.subject = sc.next();
        
        
    }
}
