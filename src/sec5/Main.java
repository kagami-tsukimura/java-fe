package sec5;

public class Main {
    public static void main(String[] args) {
        int value;
        int[] array;
        int[] result = new int[3];

        value = 100;
        result[0] = 200;
        result[1] = 200;
        result[2] = 200;

        array = new int[] {1, 2, 3, value};

        System.out.println("value = " + value);
        System.out.println(array[3]);
        System.out.println(result[2]);
    }
}
