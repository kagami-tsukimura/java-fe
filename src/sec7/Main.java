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

        String msg = function2("Hello");
        System.out.println(msg + "World");
    }

    public static void function(String msg, int number) {
        System.out.println(msg);
        System.out.println(number);
    }

    public static String function2(String msg) {
        System.out.println("------");
        msg = "[" + msg + "]";
        System.out.println(msg);
        System.out.println("------");
        return msg;
    }
}
