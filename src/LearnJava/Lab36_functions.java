package LearnJava;

public class Lab36_functions {
    public static void main(String[] args) {
        //block of code which can be reused
        // pre-build Math.max()
        // user created/ defined
        //Two components of function 1. define a function 2.call the function
        String greet = function_type2();
        function_type3("Areeb");
        function_type4(1,1998);
    }
      static void greet(){
        System.out.println("Hello, good morning");
        // function within a function isn't allowed

          // 1.functions without param & return type
          // 2.functions without param but with return type
          // 3.with param but without return type
          // 4.with param & return type

    }
    static void function_type1(){
        System.out.println("functions without param & return type");
    }

    static String function_type2(){
        System.out.println("functions without param but with return type");
        return "Hello"; // for return give data type in function and this value can be stored
    }

    static void function_type3(String name){
        System.out.println("with param but without return type");
        System.out.println("Your name is -> " + name);
    }

    static int function_type4(int a, int b){
        System.out.println("with param & return type");
        return a+b;
    }



}
