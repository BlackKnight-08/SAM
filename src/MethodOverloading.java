
import java.util.*;
class calculator{
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b,int c){
        return a+b+c;
    }
    public double add(double a, double b){
        return a+b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        calculator c = new calculator();
        int r = c.add(5, 6, 8);

        System.out.println(r);
    }

}
