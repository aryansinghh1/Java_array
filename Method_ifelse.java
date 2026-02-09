public class Method_ifelse {

    static void myMethod(int age){

        if(age < 18){
            System.out.println("person in minor");
        }
        else{
            System.out.println("he is not minor");
        }
    }
    public static void main(String[] args) {
        myMethod(18);
    }
}
