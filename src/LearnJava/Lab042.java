package LearnJava;

public class Lab042 {
    public static void main(String[] args) {
        //Strings are immutable(means it will create a new string) so there are String builders, String buffers
        StringBuilder stringBuilder = new StringBuilder("Areeb");
        //if you change the value there will be still one string

        stringBuilder.append("Zahra");
        //now the string is Areeb Zahra, memory loss issue is solved

        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append("World");


        //Both are same difference is of thread security ,buffers are synchronized (slower due to synchronization)
        // builders are faster because they aren't synchronized
    }
}
