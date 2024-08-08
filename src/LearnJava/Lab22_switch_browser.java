package LearnJava;

import java.util.Scanner;

public class Lab22_switch_browser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser you want to use :");
        String browser = sc.next();

        switch (browser) {
            case "Google":
                System.out.println("Open Google");
                break;
            case "Firefox":
                System.out.println("Open FireFox");
            default:
                System.out.println("Don't know which browser to opem");
        }
        sc.close();
    }
}
