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

        int[][] arrayInts = new int[][]{
            {3, 0, 0, 0, 0},
            {0, 2, 2, 0, 0},
            {0, 0, 0, 1, 3},
            {0, 0, 0, 2, 0},
            {0, 0, 0, 0, 1},
        };

        System.out.println(arrayInts[0][0]);

        int[] age = new int[10];
        age[0] = 14;
        age[1] = 21;
        age[2] = 22;
        age[3] = 19;
        age[4] = 31;
        age[5] = 18;
        age[6] = 20;
        age[7] = 21;
        age[8] = 33;
        age[9] = 18;

                
        int res = age[1] + age[8];
        
        System.out.println(res);

        String[] name = new String[] {"田中", "山田", "高橋", "木村"};
        System.out.println(name[0] + ", " + name[1] + ", " + name[2] + ", " + name[3]);

        int[][] tail = new int[3][4];
        tail[0][0] = 173;
        tail[0][1] = 169;
        tail[0][2] = 176;
        tail[0][3] = 182;
        tail[1][0] = 170;
        tail[1][1] = 171;
        tail[1][2] = 175;
        tail[1][3] = 172;
        tail[2][0] = 180;
        tail[2][1] = 168;
        tail[2][2] = 167;
        tail[2][3] = 173;

        System.out.println(tail[0][0] + "," + tail[0][1] + "," + tail[0][2] + "," + tail[0][3]);
        System.out.println(tail[1][0] + "," + tail[1][1] + "," + tail[1][2] + "," + tail[1][3]);
        System.out.println(tail[2][0] + "," + tail[2][1] + "," + tail[2][2] + "," + tail[2][3]);


    }
}
