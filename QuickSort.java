public class QuickSort implements SortingAlgorithm {

    public void sort(int [] a){
        quicksort(a, 0, a.length-1);
    }

    private void quicksort(int[] a, int left, int right){
        if(left < right){
            int pivotIndex = partition(a, left, right);
            quicksort(a, left, pivotIndex-1);
            quicksort(a, pivotIndex+1, right);
        }
    }

    private int partition(int[] a, int left, int right){
        if(left < right){
            int pivot = left;
            int i = left+1;
            int j = right;

            while(i<j){
                while(i < right && a[i] < a[pivot]){
                    ++i;
                }
                while(j > i && a[j] > a[pivot]){
                    --j;
                }
                if(i<j){
                    swap(a, i, j);
                }
            }
            swap(a, j, pivot);
            return j;
        }
        return left;
    }

    private void swap(int[] a, int index1, int index2){
        int tempValue = a[index1];
        a[index1] = a[index2];
        a[index2] = tempValue;
    }
}
