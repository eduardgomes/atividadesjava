import java.util.Random;

public class SortComparison {
    public static void main(String[] args) {
        int[] sizes = {100, 500, 1000};
        
        for (int size : sizes) {
            int[] vetor = generateRandomArray(size);

            System.out.println("\nTamanho do vetor: " + size);

            int[] vetorSelection = vetor.clone();
            int[] vetorInsertion = vetor.clone();

            long startTime = System.nanoTime();
            selectionSort(vetorSelection);
            long endTime = System.nanoTime();
            System.out.println("Tempo de execução do Selection Sort: " + (endTime - startTime) + " ns");

            startTime = System.nanoTime();
            insertionSort(vetorInsertion);
            endTime = System.nanoTime();
            System.out.println("Tempo de execução do Insertion Sort: " + (endTime - startTime) + " ns");
        }
    }
    
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000); // Valores entre 0 e 999
        }
        return array;
    }

    public static void selectionSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = vetor[minIndex];
            vetor[minIndex] = vetor[i];
            vetor[i] = temp;
        }
    }

    public static void insertionSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }
}
