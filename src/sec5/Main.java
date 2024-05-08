package sec5;

public class Main {
    public static void main(String[] args) {
        int value;
        int[] array1;
        int[] result = new int[3];

        value = 1;
        result[0] = 100;
        result[1] = 200;
        result[2] = 300;

        array1 = new int[] {1, 2, 3, value};

        System.out.println("value = " + value);
        System.out.println(array1[3]);
        System.out.println(result[2]);
        System.out.println(result[value]);

        int[] array = new int[] {1, 2, 3, 4, 5};
        int right, left;
        int tmp;

        System.out.println("array = " + array[0] + ", " + array[1] + ", " + array[2] + ", " + array[3] + ", " + array[4]);

        for (left = 0; left < array.length / 2; left++) {
            right = array.length - 1 - left;
            tmp = array[right];
            array[right] = array[left];
            array[left] = tmp;
        }

        System.out.println("array = " + array[0] + ", " + array[1] + ", " + array[2] + ", " + array[3] + ", " + array[4]);

    }
}
