
package org.example.questao1;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Data
public class MergeSort {
    private List<Integer> arr;
    MergeSort(){
        arr = new ArrayList<>();
    }
    MergeSort(int tam){
        Random random = new Random();
        arr = new ArrayList<>();
        for(int i = 0; i < tam;i++){
            addElement(random.nextInt(tam*2));
        }
    }
    public void addElement(int item){
        arr.add(item);
    }
    public void lista(){
        arr.forEach(System.out::println);
    }
    public static void mergeSortRecursivo(List<Integer> a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        List<Integer> l = new ArrayList<>();
        List<Integer> r = new ArrayList<>();

        for (int i = 0; i < mid; i++) {
            l.add(i, a.get(i));
        }
        for (int i = mid; i < n; i++) {
            r.add(i - mid,a.get(i));
        }
        mergeSortRecursivo(l, mid);
        mergeSortRecursivo(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }
    public static void merge(
            List<Integer> a, List<Integer> l, List<Integer> r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l.get(i) <= r.get(j)) {

                a.set(k++,l.get(i++));
            }
            else {
                a.set(k++,r.get(j++));
            }
        }
        while (i < left) {
            a.set(k++,l.get(i++));
        }
        while (j < right) {
            a.set(k++, r.get(j++));
        }
    }
    public static void mergeSortIterativo(List<Integer> vetor,int tamanho) {

        int elementos = 1;
        int inicio, meio, fim;
        while(elementos < tamanho) {
            inicio = 0;
            while(inicio + elementos < tamanho) {
                meio = inicio + elementos;
                fim = inicio + 2 * elementos;
                if(fim > tamanho)
                    fim = tamanho;
                intercala(vetor, inicio, meio, fim);
                inicio = fim;
            }
            elementos = elementos * 2;
        }
    }
    private static void intercala(List<Integer> vetor, int inicio, int meio, int fim) {
        /* Vetor utilizado para guardar os valors ordenados. */
        int novoVetor[] = new int[fim - inicio];
        /* Variavel utilizada para guardar a posicao do inicio do vetor. */
        int i = inicio;
        /* Variavel utilizada para guardar a posição do meio do vetor. */
        int m = meio;
    /* Variavel utilizada para guarda a posição onde os
      valores serão inseridos no novo vetor. */
        int pos = 0;

    /* Enquanto o inicio não chegar até o meio do vetor, ou o meio do vetor
      não chegar até seu fim, compara os valores entre o inicio e o meio,
      verificando em qual ordem vai guarda-los ordenado.*/
        while(i < meio && m < fim) {
      /* Se o vetor[i] for menor que o vetor[m], então guarda o valor do
        vetor[i] pois este é menor. */
            if(vetor.get(i) <= vetor.get(m)) {
                novoVetor[pos] = vetor.get(i);
                pos = pos + 1;
                i = i + 1;
                // Senão guarda o valor do vetor[m] pois este é o menor.
            } else {
                novoVetor[pos] = vetor.get(m);
                pos = pos + 1;
                m = m + 1;
            }
        }

        // Adicionar no vetor os elementos que estão entre o inicio e meio,
        // que ainda não foram adicionados no vetor.
        while(i < meio) {
            novoVetor[pos] = vetor.get(i);
            pos = pos + 1;
            i = i + 1;
        }

        // Adicionar no vetor os elementos que estão entre o meio e o fim,
        // que ainda não foram adicionados no vetor.
        while(m < fim) {
            novoVetor[pos] = vetor.get(m);
            pos = pos + 1;
            m = m + 1;
        }

        // Coloca no vetor os valores já ordenados.
        for(pos = 0, i = inicio; i < fim; i++, pos++) {
            vetor.set(i,novoVetor[pos]);
        }
    }

}
