package sec7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Random rand = new Random();
        int num = rand.nextInt(10) + 100;
        function(num);
    }

    public static void function(int number) {
        System.out.println("function");
        System.out.println(number);
    }
    
}
