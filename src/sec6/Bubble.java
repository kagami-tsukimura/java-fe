package sec6;

public class Bubble {
    public static void main(String[] args) {
        int[] A = new int[] {100, 0, 15, 22, 69, 985, 47};
        
        for(int i = 0; i < A.length ; i++) {
            for(int j = A.length -1; j >= i+1 ; j--){
                if(A[j] < A[j-1]){
                    int w = A[j];
                    A[j] = A[j-1];
                    A[j-1] = w;
                }
            }
        }
        
        for(int i = 0; i < A.length ; i++) {
            System.out.println(A[i]);
        }
    }
}
