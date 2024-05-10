package sec7;

public class Recursive {

    public static void main(String[] args) {
        int result = factorial(4);
        System.out.println(result);
    }

    private static int factorial(int num) {
        int result = num;
        for(int i = num; i > 1 ; i --){
            result *= i-1;
        }

        return result;
    }
}

