// static variable to be accessed using class name
class Mobile{
    String brand;
    int price;
    static String name;    //static variable is common for all
    static    // Can be called only one time
    {
        name = "Phone";
        System.out.println("Shhhh");
    }

    public Mobile(){
        String brand = "Samsung";
        int price = 10000;
    }
    public void show(){
        System.out.println("Mobile brand is : " + brand + " and name is: " + name + " and price is: " + price);
    }
    public static void show1(Mobile obj){       //static method
        System.out.println("Mobile brand is : " + obj.brand + " and name is: " + name + " and price is: " + obj.price);
    }   // cannot use non static variable in an static method but can use static variable
}



public class statickeyword
{
    public static void main(String[] args)
    {
        Mobile obj = new Mobile();
        obj.brand= "Apple";
        obj.price=100;
        Mobile.name="Phone";

        Mobile obj1 = new Mobile();
        obj1.brand="Apple";
        obj1.price=100;
        Mobile.name="Smartphone";

        Mobile.name = "babaphone";

        Monster obj2 = new Monster();


        obj.show();
        obj1.show();
        Mobile.show1(obj);
        System.out.println(obj2.getName());
    }
}
