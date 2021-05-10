import java.util.Arrays;

public class CycleSort {
    public static int[] sort(int[] values){
        boolean[] inPlace = new boolean[values.length];
        for(int i = 0; i < values.length;)
            if(inPlace[i])
                i++;
            else {
                int p = 0;
                for (int j : values)
                    if(j < values[i])
                        p++;
                int temp = values[i];
                values[i] = values[p];
                values[p] = temp;
                inPlace[p] = true;
            }
        return values;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,11,4,13,127,19,23,29};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
