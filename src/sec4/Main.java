package sec4;
public class Main {
    public static void main(String[] args) {
        int ret;
        int age = 9;

        if (age <= 3) {
            ret = 100;
        } else if (age <= 9) {
            ret = 300;
        } else {
            ret = 500;
        }
        System.out.println("ret = " + ret);


        int value;
        value = 10;

        if(value == 0 || value == 100) {
            System.out.println("value = 0 or 100");
        } else if(value != 10) {
            System.out.println("value != 10");
        } else {
            System.out.println("value = 10");
        }
    }
}