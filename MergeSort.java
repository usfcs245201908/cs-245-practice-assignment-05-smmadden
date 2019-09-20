import java.util.*;

public class MergeSort implements SortingAlgorithm {

    public void sort(int [] a){
        if(a.length > 1){
            int[] left = Arrays.copyOfRange(a, 0, a.length/2);
            int[] right = Arrays.copyOfRange(a,a.length/2 + 1, a.length);
            sort(left);
            sort(right);
            merge(a, left, right);
        }
    }

    private void merge(int[] a, int[] left, int[] right){
        int k=0, i=0, j=0;
        while(i < left.length && j < right.length){ // checking to see if elements left
            if(left[i] <= right[j]){
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
            while(i< left.length){
                a[k++] = left[i++];
            }
            while(j< right.length){
                a[k++] = right[j++];
            }
        }
    }
}
