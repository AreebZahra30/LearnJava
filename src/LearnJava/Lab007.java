package LearnJava;

public class Lab007 {
    public static void main(String[] args) {
        // ++ pre-increment operand
        // value is incremented first
        int a = 239;
        int b = ++a ; // a = a+1
        System.out.println(a);
        System.out.println(b);

        int a_post = 15;
        System.out.println(a_post++); // first print the value then increment it
        int a_result = a_post++ ;
        System.out.println(a_result);

        int age = 50;  //post increment
        int result = age++ ;
        System.out.println(age);
        System.out.println(result );

        int num = 50; // pre increment
        int movie = ++num ;
        System.out.println(num);
        System.out.println(movie);
































































































































    }
}
