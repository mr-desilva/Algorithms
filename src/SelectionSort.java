import java.util.Arrays;
/*
 Selection sort (This is using maximum value, so it goes to right) - correct
 Same algorithm can perform using minimal value, so it swap index
 1. Find the maximal element of the unsorted section
 2. Move it to the end of the unsorted section; this becomes part of the sorted section
 3. Repeat until the unsorted section is empty.

 Big O(N^2)
*/

public class SelectionSort {
    public static int[] selectionSort(int[] arr)
    {
        int lastUnsorted = arr.length - 1;
        while (lastUnsorted > 0)
        {
            // Finding the index and the value of the maximum unsorted value
            int maxIndex = 0;
            int maxValue = arr[0];
            for (int i = 1; i <= lastUnsorted; i++) {
                if (arr[i] > maxValue) // New maximum value
                {
                    maxIndex = i;
                    maxValue = arr[i];
                }
            }
            // swap the new maximum value with the last unsorted section
            arr[maxIndex] = arr[lastUnsorted];
            arr[lastUnsorted] = maxValue;
            lastUnsorted--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {45,1,22,12,67,4,6,36,7};
        System.out.println("Unsorted array : " + Arrays.toString(arr));
        System.out.println("Sorted array : " + Arrays.toString(selectionSort(arr)));
    }
}
