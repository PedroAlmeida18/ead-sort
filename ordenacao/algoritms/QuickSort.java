package ordenacao.algoritms;

import ordenacao.Sorter;

public class QuickSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();
        quicksort(sorted, 0, sorted.length-1);
        return sorted;
    }
    static void quicksort ( int [] sorted, int esquerda , int direita){
        if ( esquerda<direita){
            int pivo = particao( sorted, esquerda,direita );
            quicksort(sorted, esquerda, pivo);
            quicksort(sorted, pivo+1, direita);

        }
    }
    static int particao(int[] sorted, int esquerda, int direita){
        int pivo2 = sorted[ (esquerda + direita)/2  ];
        int i = esquerda - 1;
        int j = direita +1;
        while(true ){
            do{
                i++;

            }while( sorted [i] < pivo2);
            do{
                j--;
            } while ( sorted[j] > pivo2);
            if (i >= j){
                return j;
            }
            int aux = sorted[i];
            sorted[i] = sorted[j];
            sorted [ j] = aux;
        }
    }

    @Override
    public String getName() {
        return "QuickSort";
    }

}
