package LearnJava;

public class Lab31 {
    public static void main(String[] args) {
        for (int i = 0; i < 100 ; i++) {
            if (i%2 ==0){
                System.out.println("Even -> " + i );
                continue; //so that the odd number statement doesn't get executed
            }
            System.out.println("Odd -> " + i );
        }
        for (int j = 0; j < 100; j = j+10) {
            System.out.println(j);
        }
    }
}
