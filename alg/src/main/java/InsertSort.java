package main.java;

public class InsertSort implements Sort {

    @Override
    public void sort(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            insert(array, i, array[i]);
        }
    }

    private void insert(Integer[] array, int position, Integer value) {
        int i = position - 1;
        while (i >= 0 && array[i] > value) {
            array[i + 1] = array[i];
            i = i-1;
        }
        array[i+1] = value;
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{9,15,8,1,4,11};

        InsertSort insertSort = new InsertSort();
        insertSort.sort(array);
    }
}
