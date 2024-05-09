package sec6;

public class Bubble {
    public static void main(String[] args) {
        int[] A = new int[] {10, 2, 23, 4, 15};

        System.out.println("A = " + A[0] + ", " + A[1] + ", " + A[2] + ", " + A[3] + ", " + A[4]);
        for(int i = 0; i < A.length - 1; i++) {
            for(int j = A.length - 1; j >= i + 1; j--) {
                if(A[j] < A[j - 1]) {
                    int w = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = w;
                }
            }
        }
        System.out.println("A = " + A[0] + ", " + A[1] + ", " + A[2] + ", " + A[3] + ", " + A[4]);
    }
}
