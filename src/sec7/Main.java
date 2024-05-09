package sec7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String msg2 = "World";
        Random rand = new Random();
        int num2 = rand.nextInt(10) + 100;
        function("Hello", rand.nextInt(10) + 100);
        function(msg2, num2);
    }

    public static void function(String msg, int number) {
        System.out.println(msg);
        System.out.println(number);
    }
    
}
