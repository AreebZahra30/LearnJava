package LearnJava;

import java.util.Scanner;

public class Lab39 {
    public static void main(String[] args) {
        float[] numbers = new float[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("Enter marks of Subject -> " + (i+1)
            );
            numbers[i] = sc.nextFloat();
        }
        float avg = (numbers[1] + numbers[2] + numbers[3] + numbers[4] + numbers[0]) / 5;
        System.out.println("Average marks -> " + avg ) ;
        sc.close();
    }
}
