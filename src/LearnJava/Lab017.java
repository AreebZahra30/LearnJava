package LearnJava;

import java.util.Scanner;

public class Lab017 {
    public static void main(String[] args) {
        // 1.Logic building, 2.select data type , 3.check if conversion is required
        //3. Rough logic , optimize
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in); //object of scanner class
        int num = sc.nextInt();
        System.out.println(num);
        if(num%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}
