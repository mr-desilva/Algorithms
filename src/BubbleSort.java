import java.util.Arrays;
/*
 Bubble sort
 1. Starting with the first element(index = 0), compare the current element with the next element of the array.
 2. If the current element is greater than the next element of the array, swap them.
 3. If the current element is less than the next element, move to the next element. Repeat Step 1.

 Big O(N^2)
*/

public class BubbleSort {
    public static int[] BubbleSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    // swap the new maximal value
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    return arr;
    }

    public static void main(String[] args) {
        int[] arr = {45,1,22,12,67,4,6,36,7};
        System.out.println("Unsorted array : " + Arrays.toString(arr));
        System.out.println("Sorted array : " + Arrays.toString(BubbleSort(arr)));
    }
}
