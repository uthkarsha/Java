package newpackage;

import java.util.Scanner;

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

public class StudentClass2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the info of std 1: ");
        String name = sc.next();
        String ID = sc.next();
        double CGPA = sc.nextDouble();
        int age = sc.nextInt();
        
        Student std1 = new Student(name,ID,CGPA,age);
        
        System.out.println("Enter the info of std 2: ");
        name = sc.next();
        ID = sc.next();
        CGPA = sc.nextDouble();
        age = sc.nextInt();
        
        Student std2 = new Student(name,ID,CGPA,age);
        
        System.out.println(std1.name+" "+std1.ID+" "+std1.CGPA+" "+std1.age);
        System.out.println(std2.name+" "+std2.ID+" "+std2.CGPA+" "+std2.age);
    }
}
