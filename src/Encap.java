import java.util.Scanner;

class Human {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class Encap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Human obj = new Human();
        System.out.print("Enter your age:");
        int k = s.nextInt();

        obj.setAge(k);

        System.out.print("Your age is: " + obj.getAge());

        s.close();
    }
}