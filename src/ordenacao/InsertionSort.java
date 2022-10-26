package ordenacao;

public class InsertionSort {
    private int[] vector;

    public InsertionSort(int[] vector) {
        this.vector = vector;
    }

    public int[] getVector() {
        return vector;
    }

    public void sort(){
        int key;
        for (int j = 1; j < vector.length; j++) {
            key = vector[j];
            int i = j-1;
            while ( (i > 0) && (vector[i]>key)){
                vector[i+1] = vector[i];
                i--;
            }
            vector[i+1] = key;
        }
    }
}
