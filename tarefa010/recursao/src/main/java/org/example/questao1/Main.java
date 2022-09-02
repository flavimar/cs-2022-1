package org.example.questao1;

public class Main {


    public static void main(String[] args) {
        MergeSort mergeSortRec = new MergeSort(100);
        MergeSort mergeSortIt = mergeSortRec;
        System.out.println("TEMPO DA ORDENAÇÃO DE 100 ELEMENTOS RECURSIVO");
        tempoOrdenaçãoRecursivo(mergeSortRec);
        System.out.println("TEMPO DA ORDENAÇÃO DE 100 ELEMENTOS ITERATIVO");
        tempoOrdenaçãoRecursivo(mergeSortIt);

        System.out.println();


        mergeSortRec = new MergeSort(1000);
        mergeSortIt = mergeSortRec;
        System.out.println("TEMPO DA ORDENAÇÃO DE 1000 ELEMENTOS RECURSIVO");
        tempoOrdenaçãoRecursivo(mergeSortRec);
        System.out.println("TEMPO DA ORDENAÇÃO DE 1000 ELEMENTOS ITERATIVO");
        tempoOrdenaçãoRecursivo(mergeSortIt);

        System.out.println();

        mergeSortRec = new MergeSort(10000);
        mergeSortIt = mergeSortRec;
        System.out.println("TEMPO DA ORDENAÇÃO  DE 10000 ELEMENTOS RECURSIVO");
        tempoOrdenaçãoRecursivo(mergeSortRec);
        System.out.println("TEMPO DA ORDENAÇÃO DE 10000 ELEMENTOS ITERATIVO");
        tempoOrdenaçãoRecursivo(mergeSortIt);



    }
    public static void tempoOrdenaçãoRecursivo(MergeSort mergeSort){
        long time = System.currentTimeMillis();
        MergeSort.mergeSortRecursivo(mergeSort.getArr(),mergeSort.getArr().size());
        time = System.currentTimeMillis() - time;
        System.out.println(time + " MILESEGUNDOS");
    }
    public void tempoOrdenaçãoIterativo(MergeSort mergeSort){
        long time = System.currentTimeMillis();
        MergeSort.mergeSortIterativo(mergeSort.getArr(),mergeSort.getArr().size());
        time = System.currentTimeMillis() - time;
        System.out.println(time + " MILESEGUNDOS");
    }
}
