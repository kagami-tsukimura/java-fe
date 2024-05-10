package sec7;

public class Branch {
    public static void main(String[] args) {
        int age = 5;
        System.out.println(fee(age));
    }

    private static int fee(int age) {
        int ret;
        if(age <= 3) {
            ret = 100;
        }else if(age <= 9) {
            ret = 300;
        }else {
            ret = 500;
        }
        return ret;
    }
    
}
