package sec3;

public class Main {
    public static void main(String[] args) {
        // int: 整数型
        int age = 20;
        // double: 浮動小数点型
        double pi = 3.14;
        // String: 文字列型
        String str1 = "Hello";
        // char: 文字型
        char char1  = 'A';
        // final: 定数
        final int a = 0;
        // a = 1;

        int num1 = 100;
        int num2 = 3;
        int sum = num1 + num2;
        int sub = num1 - num2;
        int multi = num1 * num2;
        double divide = (double) num1 / num2;
        int mod = num1 % num2;
        
        
        System.out.println("年齢は" + age + "歳です。");
        System.out.println(pi);
        System.out.println(age + pi);
        System.out.println(str1 + age + pi);
        System.out.println(str1 + (age + pi));
        System.out.println(char1);
        System.out.println(a);
        System.out.println("num1 + num2 = " + sum);
        System.out.println("num1 - num2 = " + sub);
        System.out.println("num1 * num2 = " + multi);
        System.out.println("num1 / num2 = " + divide);
        System.out.println("num1 % num2 = " + mod);
    }
}
