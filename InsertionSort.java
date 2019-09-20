public class InsertionSort implements SortingAlgorithm {

    public void sort(int [] a){
        int checkedValue;
        for(int i=1; i<a.length; i++){
            checkedValue = a[i];
            int j = i-1;

            while(j>=0 && checkedValue < a[j]){
                a[j+1] = a[j];
                a[j] = checkedValue;
                j = j-1;
            }
        }
    }

}