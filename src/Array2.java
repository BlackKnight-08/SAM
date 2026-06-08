// Created an class named student and then made various objects and then stored it in an array
import java.util.Scanner;

class Student
{
    String name;
    int age;
    int marks;

}
public class Array2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Student s1 = new Student();
        s1.name = "Saurabh";
        s1.age = 19;
        s1.marks = 100;
        Student s2 = new Student();
        s2.name = "GAJU";
        s2.age = 18;
        s2.marks = 56;
        Student s3 = new Student();
        s3.name = "Saurabh";
        s3.age = 23;
        s3.marks = 87;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i].name +  " " + students[i].age +  " " + students[i].marks);
        }
    }
}
