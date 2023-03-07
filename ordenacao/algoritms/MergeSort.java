package ordenacao.algoritms;

import ordenacao.Sorter;

public class MergeSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();
        for (i =0; i< elements.length;i++){
            int a = (elements.length)/2;
        }
       
        return sorted;
    }

    @Override
    public String getName() {
        return "MergeSort";
    }

}
