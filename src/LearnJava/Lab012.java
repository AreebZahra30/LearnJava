package LearnJava;

import java.util.Locale;

public class Lab012 {
    public static void main(String[] args) {
       String password = "Test123" ;
       String password_u = password.toLowerCase();
        System.out.println(password == password_u);
        System.out.println(password.equals(password_u));
        System.out.println(password.equalsIgnoreCase(password_u)); /*will ignore upper lower case will just check
        the content */
    }
}
