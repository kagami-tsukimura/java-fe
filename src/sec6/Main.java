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
        for (int left = 1; left <= array.length / 2; left++) {
            right = array.length - left;
            tmp = array[right];
            array[right] = array[left];
            array[left] = tmp;
        System.out.println(array[0] + ", " + array[1] + ", " + array[2] + ", " + array[3] + ", " + array[4]);
        }
        System.out.println(array[0] + ", " + array[1] + ", " + array[2] + ", " + array[3] + ", " + array[4]);
    }
}
