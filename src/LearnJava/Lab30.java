package LearnJava;

public class Lab30 {
    public static void main(String[] args) {
        for (int i = 1; i <=50 ; i++) {
            if (i%2 == 0){  //can print odds by using condition i%2 != 0
                System.out.println(i);
            }
        }
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
            if ( j==5 ){
               continue;  //it means the code outside loop will be skipped for this
            }
            System.out.println("Bye");
        }
    }
}
