public class descrescente {
    
}
public class SelectionSortDecrescente {
    public static void main(String[] args) {
        int[] vetor = {34, 8, 64, 51, 32, 21, 4, 12, 67, 19, 78, 45, 34, 88, 29, 57, 83, 92, 6, 11};

        System.out.println("Vetor original:");
        exibirVetor(vetor);

        selectionSortDecrescente(vetor);
        System.out.println("Vetor em ordem decrescente):");
        exibirVetor(vetor);
    }

    public static void selectionSortDecrescente(int[] vetor) {
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMaior = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] > vetor[indiceMaior]) {
                    indiceMaior = j;
                }
            }

            if (indiceMaior != i) {
                int temp = vetor[i];
                vetor[i] = vetor[indiceMaior];
                vetor[indiceMaior] = temp;
            }
        }
    }

    public static void exibirVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
