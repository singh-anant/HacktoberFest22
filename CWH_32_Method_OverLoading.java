public class CWH_32_Method_OverLoading {

    static void foo(){
        System.out.println("Good Morning bro!");
    }

    static void foo(int a){
        System.out.println("Good Morning "+a+" bro!");
    }

    static void foo(int a, int b){ // a & b are PARAMETERS
        System.out.println("Good Morning "+a+" bro!");
        System.out.println("Good Morning "+b+" bro!");
    }

    static  void change(int a){
        a=98;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }

    static void tellJoke()
    {
        System.out.println("I invented a new word!\n" + "Plagiarism!");
    }

    public static void main(String[] args) { // MAIN METHOD
        tellJoke();
        // Case 1 : Changing the Integer
        //int x=45;
        //change(x);
        //
        // System.out.println("The value of x after running change is: "+x);

        // Case 2 : Changing the Array
        //int [] marks = {52, 73, 77, 89, 98, 94};//it creates ARRAY OBJECT & here MARKS is a REFERENCE
        //change2(marks);//Here we are passing the object/REFERENCE
        //System.out.println("The value of x after running change is: "+marks[0]);



        // METHOD OVERLOADING  (Only parameters can be changed) (can't be performed by changing the return type)
        foo();
        foo(3000); // 3000 is ARGUMENT
        // ARGUMENTS ARE ACTUAL VALUES
        foo(3000,4000);

    }
}
