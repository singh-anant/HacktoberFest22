class Base1{
    Base1(){ //  CONSTRUCTOR has SAME NAME
        System.out.println("I am a Constructor");
    }
    Base1(int x){ //  CONSTRUCTOR OVERLOADING
        System.out.println("I am an overloaded Constructor with value of x as: "+x);
    }
//    public int x;
//
//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
}

class Derived1 extends Base1{
    Derived1(){
//        super(0);
//      Bcoz of SUPER I am an overloaded Constructor with value of a as: 0 RUNS
        // we will use this when we want to run the constructor having ARGUMENTS
        System.out.println("I am a derived class constructor");
    }

    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded Constructor of Derived with value of y as: "+y);
    }
//    public int y;
//
//    public int getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
}

class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derive constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am an overloaded Constructor of Derived with value of z as:"+z);
    }
}

public class CWH_46_Constructors_In_Inheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1(); // Runs just 1
//        Derived1 d = new Derived1(); // Runs both constructors  // Has no argument
//        Derived1 d = new Derived1(14,9);
//        ChildOfDerived cd = new ChildOfDerived(); // Calls without SUPER
        ChildOfDerived cd = new ChildOfDerived(12,13,15); // Calls SUPER
    }
}
