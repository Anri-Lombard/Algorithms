import java.util.*;
public class HelloGoodbye {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name1 = input.next(), name2 = input.next();
        System.out.println("Hello " + name1 + " and " + name2);
        input.close();
    }
}
