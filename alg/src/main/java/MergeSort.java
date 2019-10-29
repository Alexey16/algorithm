package main.java;

import java.util.Arrays;

public class MergeSort implements Sort {

    @Override
    public void sort(Integer[] array) {
        Integer[] copy = Arrays.copyOf(array, array.length);
        mergeSort(copy, array, 0, array.length);
    }

    private void mergeSort(Integer[] copy, Integer[] array, int startIdx, int endIdx) {
        if (endIdx - startIdx < 2) {
            return;
        }
        if (endIdx - startIdx == 2) {
            if (array[startIdx] > array[startIdx + 1]) {
                Integer temp = array[startIdx];
                array[startIdx] = array[startIdx + 1];
                array[startIdx + 1] = temp;
                return;
            }
        }

        int mid = (endIdx + startIdx) / 2;
        mergeSort(array, copy, startIdx, mid);
        mergeSort(array, copy, mid, endIdx);

        int i = startIdx;
        int j = mid;
        int idx = startIdx;
        while (idx < endIdx) {
            if ( j >= endIdx || (i < mid && copy[i] < copy[j]) ) {
                array[idx] = copy[i];
                i++;
            } else {
                array[idx] = copy[j];
                j++;
            }
            idx++;
        }

    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        Integer[] integers = {5, 4, 3, 2, 1};
        mergeSort.sort(integers);
        System.out.println("a");
    }
}
