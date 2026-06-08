import java.util.Scanner;

class Human {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Encap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Human obj = new Human();
        System.out.print("Enter your age:");
        int k = s.nextInt();
        obj.setAge(k);
        System.out.print("Enter your name:");
        String str = s.next();
        obj.setName(str);

        System.out.println("Your age is: " + obj.getAge());
        System.out.println("Your name is: " + obj.getName());
        s.close();
    }
}