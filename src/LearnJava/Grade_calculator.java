package LearnJava;

import java.util.Scanner;

public class Grade_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student marks:");
        int marks = sc.nextInt();
         char grade = 'F';
        if(marks >= 90 && marks <= 100){
            grade = 'A';
        }
        else if(marks >= 70 && marks < 90){
            grade = 'B';
        }
        else if(marks >= 60 && marks < 70){
            grade = 'C';
        }
        else if(marks <= 0 || marks > 100){
            System.out.println("Out of range");
        }
        else{
            grade ='F';
        }
        System.out.println("Your grade is :" + grade);
        sc.close();
    }
}

