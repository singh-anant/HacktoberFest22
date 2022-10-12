class Base{
    int x; // By default, it is PUBLIC

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class CWH_45_Inheritance {
    public static void main(String[] args) {
        // Creating an object of Base class
        Base b = new Base();
        b.setX(4); // Y can't be accessed from Base class
        System.out.println(b.getX());

        // OR

        // Creating an object of Derived class
        Derived d = new Derived();
        d.setX(43); // X can be accessed just because Derived class inherits the properties from Base class
        System.out.println(d.getX());
        d.setY(432); // Y can be accessed just from Derived class because y is there only
        System.out.println(d.getY());
    }
}
