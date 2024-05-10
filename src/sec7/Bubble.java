package sec7;

public class Bubble {
    public static void main(String[] args) {
        int[] A = new int[] {100, 0, 15, 22, 69, 985, 47};
        
        A = bubbleSort(A);
        arrayPrint(A);
    }

    /**
     * Sorts an array of integers using the bubble sort algorithm.
     *
     * @param  A  the array to be sorted
     * @return    the sorted array
     */
    public static int[] bubbleSort(int[] A) {
        for(int i = 0; i < A.length ; i++) {
            for(int j = A.length -1; j >= i+1 ; j--){
                if(A[j] < A[j-1]){
                    // 要素の入れ替え
                    A =replace(A, j);
                }
            }
        }
        return A;
    }

    /**
     * Replaces the element at index j in the given array with its neighbor on the right.
     *
     * @param  A  the array in which the replacement is to be done
     * @param  j  the index of the element to be replaced
     * @return    the modified array after the replacement
     */
    public static int[] replace(int[] A, int j) {
        int w = A[j];
        A[j] = A[j-1];
        A[j-1] = w;

        return A;
    }

    public static void arrayPrint(int[] A) {
        for(int i = 0; i < A.length ; i++) {
            System.out.println(A[i]);
        }
    }
}
