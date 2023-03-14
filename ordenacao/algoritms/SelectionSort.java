package ordenacao.algoritms;

import ordenacao.Sorter;

public class SelectionSort implements Sorter{

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();
        int posicaomenor ;
        for ( int i = 0;i < elements.length;i++ ){
            posicaomenor = i;
            for ( int j = i +1; j <elements.length;j++ ){
                if ( elements[j]< elements[posicaomenor]){
                    posicaomenor = j;
                }
            }
            int aux = elements[ posicaomenor] ;
            elements[posicaomenor] = elements[i];
             elements[i] = aux;

        }
        return elements;
    }

    @Override
    public String getName() {
        return "SelectionSort";
    }
}
