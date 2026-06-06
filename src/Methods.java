package Learn;

import java.util.Scanner;

class Calculator {

    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

public class Methods {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = in.nextInt();

        System.out.print("Enter second number: ");
        int n2 = in.nextInt();

        Calculator c = new Calculator();

        int result = c.add(n1, n2);

        System.out.println("Sum = " + result);

        in.close();
    }
}