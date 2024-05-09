package sec6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        for (int num = 10; num > 0; num--) {
            System.out.println(num);
        }

        int[] array = new int[] {1, 2, 3, 4, 5};
        int right = 0;
        int tmp = 0;
        System.out.println(array[0] + ", " + array[1] + ", " + array[2] + ", " + array[3] + ", " + array[4]);
        for (int left = 0; left <= (array.length -1) / 2; left++) {
            right = array.length - 1 - left;
            tmp = array[right];
            array[right] = array[left];
            array[left] = tmp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int n = 1;
        while(n <= 10) {
            System.out.println(n);
            n++;
        }

        do{
            System.out.println(n);
            n++;
        }while(n <= 10);
    }
}
