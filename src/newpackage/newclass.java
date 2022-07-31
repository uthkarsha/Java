
package newpackage;

import java.util.Scanner;

class Student{
    
    String name;
    int age;
    double CGPA;
}
        
public class newclass {
    public static void main(String[] args) {
        Student s1 = new Student();
         Scanner sc = new Scanner(System.in);
         s1.name=sc.next();
         s1.age=sc.nextInt();
         s1.CGPA=sc.nextDouble();
         
          Student s2 = new Student();
         s2.name=sc.next();
         s2.age=sc.nextInt();
         s2.CGPA=sc.nextDouble();
         
         Student s3 = new Student();
         s3.name=sc.next();
         s3.age=sc.nextInt();
         s3.CGPA=sc.nextDouble();
         System.out.println(s1.name+" "+s1.age+" "+s1.CGPA);
         System.out.println(s2.name+" "+s2.age+" "+s2.CGPA);
         System.out.println(s3.name+" "+s3.age+" "+s3.CGPA);
    }
   
}
