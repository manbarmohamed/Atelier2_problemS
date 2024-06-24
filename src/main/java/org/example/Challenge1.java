package org.example;

import java.util.ArrayList;

public class Challenge1 {

    public static void selectSort(int[] array) {
        int Tab = array.length;
        for (int i = 0; i < Tab; i++) {
            int minI = i;
            for (int j = i + 1; j < Tab; j++) {
                if (array[j] < array[minI]) {
                    minI = j;
                }
            }
            int temp = array[i];
            array[i] = array[minI];
            array[minI] = temp;
        }
    }

    public static ArrayList<Integer> removeDuplicates(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        if (array.length == 0) {
            return list;
        }
        list.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                list.add(array[i]);
            }
        }
        return list;
    }

    public static ArrayList<Integer> sortAndRemoveDuplicates(int[] array) {
        selectSort(array);
        return removeDuplicates(array);
    }
}