public class RangedSearch {
    public static int findInRange(int[] A, int low, int high){
        int n = A.length - 1;
        int index = 0;

        for(int i = 0; i < n; i++){
            if((low <= A[i]) && (A[i] <= high)){
                index = i;
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,7,11,13,17,19,23,29};
        System.out.println(findInRange(arr,11,13));
    }
}
