class Aryan{
    static void myMethod2(String a){
        System.out.println("my name is "+a);
    }

    void m2(){
        System.out.println("hello");
    }
}


public class Method_loop {
    int myMethod(int x){
        return x*2;
    }


    public static void main(String[] args) {

        Method_loop obj2 = new Method_loop();

        for(int i = 1 ; i<=5;i++){
            System.out.println("double of " + i + " is "+obj2.myMethod(i));
            // System.out.println("double of " + i + " is "+myMethod(i));
        }

        Aryan obj = new Aryan();

        // To call static method and non static method
        obj.myMethod2("aryan");

        //to call static function 2 way
        Aryan.myMethod2("yuu");

        obj.m2();


        // this will not run cause its not declare as static
        // we can only call by object
        // Aryan.m2();

    }
}
