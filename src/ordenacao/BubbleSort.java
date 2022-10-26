package ordenacao;

public class BubbleSort {

    private int[] vector;

    public BubbleSort(int[] vector) {
        this.vector = vector;
    }

    public int[] getVector() {
        return vector;
    }

    public void sort() {
        for (int i = 0; i < vector.length; i++) {
            for (int j = vector.length - 1; j > i + 1; j--) {
                if (vector[j] < vector[j - 1]) {
                    int temp = vector[j];
                    vector[j] = vector[j - 1];
                    vector[j - 1] = temp;
                }
            }
        }
    }
}
