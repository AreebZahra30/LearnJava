package LearnJava;

public class Lab009 {
    public static void main(String[] args) {
        //How to create string
        String  name = "Areeb" ; //normal way , it stores value in SCP (string constant pool) ,assignment operator
        //even you v=change the value of string it remains in the pool

        String name2 = new String("Areeba");
        /* declaring with new stores in objects heap format, new operator*/

        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.charAt(3));
    }
}
