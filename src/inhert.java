// Learned about inheritance and how can we access different classes from different places

class Calc{
    public int  add(int a,int b){ // Parent class
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
}
class Calc2 extends Calc{    // Child class
    public int  mult(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
}
class Calc3 extends Calc2{   //child class
    public double  pow(int a,int b){
        return Math.pow(a,b);
    }
}


public class inhert {
    public static void main(String[] args) {
        Calc3 obj = new Calc3();
        int a  = obj.mult(3,4);
        System.out.println(a);

    }
}
