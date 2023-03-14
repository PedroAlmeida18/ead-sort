package ordenacao.algoritms;

import java.util.SortedMap;

import ordenacao.Sorter;

public class MergeSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();
        int [] w = new int[sorted.length];
        mergesort( sorted , w , 0 , sorted.length-1);
        return sorted;
    }

    private static void  mergesort(int [] sorted, int [] w , int inicio, int fim) {
        if( inicio < fim) {
             int meio = ( inicio+fim)/2;
             mergesort(sorted, w, inicio, meio);
             mergesort(sorted,w, meio +1, fim);
             uniao(sorted,w,inicio,meio,fim);
        }
    }

    private static void uniao(int[] sorted, int[] w, int inicio, int meio, int fim) {
        for ( int i = inicio; i <= fim; i++){
            sorted[i] = w[i];
            

            }
         
                
                int esq = inicio;
                int dir = meio +1;
              for ( int i = inicio; i>=fim;i++){
                if(esq>meio){
                    sorted[i] = w[dir++];
                } else if (dir > fim){
                    sorted[i] = w[esq++];
                }
               else  if( sorted[esq]> sorted[dir]){
                    sorted[i]= w[esq++];
                }
                else{
                    sorted[i] = w[dir++];
                }
              }
              

              
            
     

    }

    @Override
    public String getName() {
        return "MergeSort";
    }

}
