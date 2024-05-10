package sec7;

public class Recursive {

    public static void main(String[] args) {
        int result = factorial(4);
        System.out.println(result);

        int res = calc(8);
        System.out.println(res);
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

    private static int calc(int num){
        int result = 1;
        
        for(int i = num; i > 1; i--){
            result *= i;
        }
        return result;
    }
}

