package LearnJava;

import java.util.Scanner;

public class Max_number {
    public static void main(String[] args) {
        System.out.println("Enter your first number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Enter your second number:");
        int num1 = sc.nextInt();

        if(num>num1){
            System.out.println(num);
        }
        else if(num1>num){
            System.out.println(num1);
        }
        else{
            System.out.println("Both are equal");
        }

    }
}
