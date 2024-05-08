package sec5;

public class Main {
    public static void main(String[] args) {
        int value;
        int[] array;

        value = 100;
        array = new int[] {1, 2, 3, value};

        System.out.println("value = " + value);
        System.out.println(array[3]);
    }
}
