package LearnJava;

public class Lab006 {
    public static void main(String[] args) {
        byte a = 10;
        //(Implicit)
        int b = a;
        System.out.println(b);
        /*
        Widening - implicit, explicit casting - lossless
        Narrowing - implicit, explicit casting (with data type) - loss of data
         Type casting - conversion between source & destination
        */
        int val = 435 ;
        int val2 = val;
        System.out.println(val2);

        long phone_no = 989993449;
        short s = (short) phone_no;
        System.out.println(phone_no);
    }
}
