package ordenacao.algoritms;

import ordenacao.Sorter;

public class SelectionSort implements Sorter{

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();
       
        return sorted;
    }

    @Override
    public String getName() {
        return "SelectionSort";
    }
}
