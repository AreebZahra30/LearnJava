package LearnJava;

public class Lab011 {
    public static void main(String[] args) {
        String name = "Areeb" ;
        char c = name.charAt(3);
        System.out.println(c);

        name.concat(" Zahra");
        System.out.println(name); //it will print only Areeb until you store the new one

        name = name.concat("Zahra");
        System.out.println(name);
    }
}
