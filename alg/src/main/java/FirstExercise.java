package main.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstExercise {


    public static void main(String[] args) {

        int startElement = 0;
        int endElement = 0;
        HeapSort heapSort = new HeapSort();
        Integer[] array = new Integer[]{0, 3, 4, 1, 2, 8, 12, 9};//
        Arrays.sort(array);

        HashMap<Integer, Integer> map = new HashMap<>();

        startElement = array[startElement];

        for (int i = 0; i < array.length; i++) {
            if (i+1 == array.length) {
                map.put(startElement, array[i]);
                break;
            }
            if (array[i] + 1 != array[i+1]) {
                endElement = array[i];
                map.put(startElement, endElement);
                startElement = array[i+1];
            }
        }

        StringBuilder st = new StringBuilder();
        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            if (set.getKey() == set.getValue()) {
                st.append(set.getKey()).append(",");
            }
            if (set.getKey() != set.getValue()) {
                st.append(set.getKey()).append("-").append(set.getValue()).append(",");
            }
        }
        System.out.println(st.substring(0, st.length() - 1));
    }
}
