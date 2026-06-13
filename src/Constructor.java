// Everytime you create an object you call the constructor
//Constructors are methods which have the same name as the class
class Monster{
    private int level;
    private String name;

    public Monster(){       // Default Constructor
        level = 999;       //Default Value if value not assigned.
        name = "Fenrir";    //Default Value if value not assigned.
    }

    public Monster(int level, String name){           //Parameterised Constructors
        this.level = level;
        this.name = name;
    }

    public int  getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Monster obj = new Monster();
        System.out.println("Monster level is: " + obj.getLevel() + " and name is : " + obj.getName());

        obj.setLevel(1);
        obj.setName("Fenrir");
        System.out.println("Monster level is: " + obj.getLevel() + " and name is : " + obj.getName());

        Monster obj1 = new Monster(997, "Albatross");

        System.out.println("Monster level is: " + obj1.getLevel() + " and name is : " + obj1.getName());
    }
}
