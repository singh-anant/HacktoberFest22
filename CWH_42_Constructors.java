class MyMainEmployee{
    private int id;
    private String name;


    public MyMainEmployee(){ // CONSTRUCTOR              // CONSTRUCTOR OVERLOADING
        id = 0;
        name = "Abhi G";
    }


    /*
    public MyMainEmployee(String myName){ // CONSTRUCTOR taking Argument
        id = 45;
        name = myName;
    }
     */

    public MyMainEmployee(String myName, int myId){ // CONSTRUCTOR taking 2 Argument
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){ // CONSTRUCTOR OVERLOADING
        id = 1;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
//        name = n; //or
        this.name = n;
    }
    public void setId(int i){
        id=i; //or
//        this.id = i;
    }
    public int getId(){

        return  id;
    }
}

public class CWH_42_Constructors {
    public static void main(String[] args) {
//        MyMainEmployee abhi = new MyMainEmployee();
//        MyMainEmployee abhi = new MyMainEmployee("Abhi Gupta"); // Passing Argument
//        MyMainEmployee abhi = new MyMainEmployee("Abhi Gupta", 12); // Passing 2 Argument
        MyMainEmployee abhi = new MyMainEmployee();

//        abhi.setName("Abhi G");
//        abhi.setId(34);
        System.out.println(abhi.getId());
        System.out.println(abhi.getName());
    }
}