package sec7;

public class Branch {

    static int ret;

    public static void main(String[] args) {
        int age = 10;
        fee(age);
        System.out.println(ret);
    }

    private static void fee(int age) {
        if(age <= 3) {
            ret = 100;
        }else if(age <= 9) {
            ret = 300;
        }else {
            ret = 500;
        }
    }
    
}
