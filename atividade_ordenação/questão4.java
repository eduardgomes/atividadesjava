public class InsertionSortDecrescente {
    public static void main(String[] args) {
        int[] vetor = {34, 8, 64, 51, 32, 21, 4, 12, 67, 19, 78, 45, 34, 88, 29, 57, 83, 92, 6, 11};

        System.out.println("Vetor original:");
        exibirVetor(vetor);

        insertionSortDecrescente(vetor);

        System.out.println("\nVetor ordenado em ordem decrescente:");
        exibirVetor(vetor);
    }

    public static void insertionSortDecrescente(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int chave = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] < chave) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = chave;
        }
    }

    public static void exibirVetor(int[] vetor) {
        for (int i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
