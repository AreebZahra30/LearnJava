package LearnJava;

import java.util.Arrays;

public class Lab40_max {
    public static void main(String[] args) {
        //max in the array
        int[] salaries = {7, 8, 9, 76,90,3};
        int max = 0;
        int min = salaries[0]; //as declaring value as 0 or 1 will make it the min
        for (int i = 0; i < salaries.length; i++) {
            if (max < salaries[i]) {
                max = salaries[i];

            }
            if ( min > salaries[i]){
                min = salaries[i];
            }
        }
        System.out.println("The maximum salary is " + max);
        /*Alternate method , ascending order
        Arrays.sort(salaries);
        System.out.println(salaries[salaries.length-1]);*/
    }
}
