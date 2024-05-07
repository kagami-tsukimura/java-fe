package sec4;
public class Main {
    public static void main(String[] args) {
        int ret;
        int age = 90;

        if (age <= 3) {
            ret = 100;
        // ageが4~9歳の間の場合
        } else if (age >= 4 && age <= 9) {
            ret = 300;
        } else {
            ret = 500;
        }
        System.out.println("ret = " + ret);
    }
}