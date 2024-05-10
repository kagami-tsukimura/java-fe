package sec7;

public class Recursive {

    public static void main(String[] args) {
        int result = factorial(4);
        System.out.println(result);
    }

    private static int factorial(int num) {
        if(num > 0) {
            return num * factorial(num - 1);
        }
        if(num == 0) {
            return 1;
        }
        return 0;
    }
}

