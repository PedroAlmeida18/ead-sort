package ordenacao.algoritms;

import ordenacao.Sorter;

public class InsertionSort implements Sorter{

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();
        for ( int i = 1; i < elements.length; i++){
          int j = i;
          while(j>0 && elements[j]< elements[j-1]) {
            int aux = elements[j];
            elements[j]= elements[j-1];
            elements[j-1]= aux ;
            j-=1; 

          }
        }
        return elements;
    }

    @Override
    public String getName() {
        return "InsertionSort";
    }

}

