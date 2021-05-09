public class BinarySearch {
    // Will return the searching value index
    public static int binarySearch(int[] arr, int findMe)
    {
        int first = 0;
        int last = arr.length - 1;

        while (first <= last)
        {
            int middle = (first + last) / 2;
            if(arr[middle] == findMe)
            {
                return middle;
            }
            else if (arr[middle] < findMe)
            {
                first = middle + 1;
            }
            else if ( arr[middle] > findMe)
            {
                first = middle - 1;
            }
            else {
                last = middle - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        // Array should be a sorted one
        int[] arr = {0,1,2,2,3,4,5,6,7};
        System.out.println(binarySearch(arr,5));
    }
}
