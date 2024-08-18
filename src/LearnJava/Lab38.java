package LearnJava;

import java.util.Scanner;

public class Lab38 {
    public static void main(String[] args) {
        int[] marks_10 = { 91,92,100,45,56,65};
        // elements are fixed , len -> 6, index 0-5
        System.out.println(marks_10.length);
        System.out.println(marks_10[2]);

        //Array can be created by using keyword "new"
        int[] marks = new int[5]; // length is 5 ,index 0-4
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for first index");
        marks[1] = sc.nextInt();
        marks[0] = 34;
        marks[2] = 44;
        marks[4] = 56;
        marks[3] = 87;
        for (int i = 0; i < marks.length ; i++) {
            System.out.println( i + " -> " + marks[i]);
        }

    }
}
