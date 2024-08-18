package LearnJava;

public class Lab41 {
    public static void main(String[] args) {
        //2d arrays
        int [][] ages = new int[3][3] ; //first is no. of rows & second is no. of columns
        ages [0][0]= 34;
        int [][] ages_3 = {
                {12, 34, 43} ,
                {56,2, 34} ,
                { 43, 56, 89}

        };
        for (int i = 0; i < ages_3.length; i++) {
            for (int j = 0; j < ages_3[i].length ; j++) {
                System.out.print(ages_3[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }

    }
}
