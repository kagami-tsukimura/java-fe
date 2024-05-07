package sec3;

public class Main {
    public static void main(String[] args) {
        // int: 整数型
        int age = 20;
        System.out.println(age);

        // double: 浮動小数点型
        double pi = 3.14;
        System.out.println(pi);

        System.out.println(age + pi);

        // String: 文字列型
        String str1 = "Hello";
        System.out.println(str1 + age + pi);
        System.out.println(str1 + (age + pi));

        // char: 文字型
        char char1  = 'A';
        System.out.println(char1);

        // final: 定数
        final int a = 0;
        // a = 1;
        System.out.println(a);
    }
}
