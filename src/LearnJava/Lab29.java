package LearnJava;

public class Lab29 {
    public static void main(String[] args) {
        for (int j = 0; j <= 10; j++) {
            if (j == 5) {
                System.out.println("Five");
            } else {
                System.out.println(j);
            }
        }
        for (int j1 = 1; j1 <= 10; j1++) {
            System.out.println(j1);
            if (j1 == 5) {
                break;  //break can only be used with condition not loop
            }
        }
    }
}
