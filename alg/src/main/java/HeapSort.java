package main.java;

public class HeapSort implements Sort {

    @Override
    public void sort(Integer[] array) {
        buildHeap(array);
        for (int i = array.length - 1; i > 0 ; i--) {
            swap(array, 0, i);
            heapify(array, 0 , i);
        }
    }

    private void buildHeap(Integer[] array) {
        for (int i = array.length/2 - 1; i >= 0; i--) {
            heapify(array, i , array.length);
        }
    }

    private void swap(Integer[] array, int pos1, int pos2) {
        if ( (pos1 < pos2 && array[pos1] < array[pos2])
                || (pos2 < pos1 && array[pos2] < array[pos1])) {
            int temp = array[pos1];
            array[pos1] = array[pos2];
            array[pos2] = temp;
        }
    }

    private void heapify(Integer[] array, int ind, int indByMax) {
        int largest = ind;
        int left = 2 * ind + 1;
        int right = 2 * ind + 2;

        if (left < indByMax && array[left] > array[ind]) {
            largest = left;
        }
        if (right < indByMax && array[right] > array[largest]) {
            largest = right;
        }
        if (largest != ind) {
            swap(array, ind, largest);
            heapify(array, largest, indByMax);
        }
    }

    public static void main(String[] args) {

        int i = 3 % 40;
        System.out.println(i);

        HeapSort heapSort = new HeapSort();
        Integer[] array = new Integer[]{8, 11, 9, 2, 10, 16};
        heapSort.sort(array);
        System.out.println(array[0]);
    }

}
