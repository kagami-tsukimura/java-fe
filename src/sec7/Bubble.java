package sec7;

public class Bubble {
    public static void main(String[] args) {
        int[] A = new int[] {100, 0, 15, 22, 69, 985, 47};
        
        // 配列処理はreturnしなくても反映される
        bubbleSort(A);
        arrayPrint(A);
    }

    /**
     * Sorts an array of integers using the bubble sort algorithm.
     *
     * @param  A  the array to be sorted
     * @return    the sorted array
     */
    public static void bubbleSort(int[] A) {
        // 配列処理はreturnしなくても反映される
        for(int i = 0; i < A.length ; i++) {
            for(int j = A.length -1; j >= i+1 ; j--){
                if(A[j] < A[j-1]){
                    // 要素の入れ替え
                    replace(A, j);
                }
            }
        }
    }

    /**
     * Replaces the element at index j in the given array with its neighbor on the right.
     *
     * @param  A  the array in which the replacement is to be done
     * @param  j  the index of the element to be replaced
     * @return    the modified array after the replacement
     */
    public static void replace(int[] A, int j) {
        // 配列処理はreturnしなくても反映される
        int w = A[j];
        A[j] = A[j-1];
        A[j-1] = w;
    }

    public static void arrayPrint(int[] A) {
        for(int i = 0; i < A.length ; i++) {
            System.out.println(A[i]);
        }
    }
}
