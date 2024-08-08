package LearnJava;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Triangular_classifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of first side : ");
        int side = sc.nextInt();

        System.out.println("Enter the length of second side : ");
        int side_1 = sc.nextInt();

        System.out.println("Enter the length of third side : ");
        int side_2 = sc.nextInt();

        if(side == side_1 && side_1==side_2){
            System.out.println("It's a Equilateral");
        }

       else if(side == side_1 || side_1 == side_2 || side == side_2 ){
            System.out.println("It's a Isosceles");
        }
       else if(side != side_1 && side_1!=side_2){
            System.out.println("It's a Scalene");
        }

        else{
            System.out.println("Something else");
        }
        sc.close();
    }
}
